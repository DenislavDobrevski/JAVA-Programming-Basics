package firstStepsInCoding_EX;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int hoursNeeded = (pages / days) / pagesPerHour;

        System.out.println(hoursNeeded);


    }
}
