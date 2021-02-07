package nestedLoops;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();

        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scan.nextLine());
            double savings = 0.0;

            while (minBudget > savings) {
                double saving = Double.parseDouble(scan.nextLine());
                savings += saving;
            }
            System.out.println(String.format("Going to %s!", destination));
            destination = scan.nextLine();
        }


    }
}
