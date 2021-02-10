package Exam;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int airlines = Integer.parseInt(scan.nextLine());

        double mostPassengers = 0.0;
        String mostPassengersAirline = "";

        for (int i = 1; i <= airlines; i++) {
            String airineName = scan.nextLine();

            int totalPassengers = 0;
            int fliesCount = 0;
            String input = scan.nextLine();

            while (!input.equals("Finish")) {
                int passengerPerFly = Integer.parseInt(input);
                totalPassengers += passengerPerFly;
                fliesCount++;
                input = scan.nextLine();
            }

            double averagePassengers = totalPassengers / fliesCount;
            averagePassengers = Math.floor(averagePassengers);
            System.out.printf("%s: %.0f passengers.\n", airineName, averagePassengers);

            if(averagePassengers > mostPassengers) {
                mostPassengersAirline = airineName;
                mostPassengers = averagePassengers;
            }
        }

        System.out.printf("%s has most passengers per flight: %.0f", mostPassengersAirline, mostPassengers);




    }
}
