package nestedLoops;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movieName = scan.nextLine();

        int studentsCount = 0;
        int kidCount = 0;
        int standardCount = 0;
        double totalTickets = 0;
        int totalKidCount = 0;
        int totalStandardCount = 0;
        int  totalStudentsCount = 0;

        while (!movieName.equals("Finish")) {
            int freeSpaces = Integer.parseInt(scan.nextLine());
            boolean flag = true;
            studentsCount = 0;
            kidCount = 0;
            standardCount = 0;

            for (int i = 0; i < freeSpaces; i++) {
                String input = scan.nextLine();
                if (input.equals("student")) {
                    studentsCount++;
                    totalStudentsCount++;
                } else if (input.equals("kid")) {
                    kidCount++;
                    totalKidCount++;
                } else if (input.equals("standard")) {
                    studentsCount++;
                    totalStandardCount++;
                } else {
                    flag = false;
                    break;
                }
            }

            totalTickets += studentsCount + standardCount + kidCount;

            if (flag) {
                System.out.printf("%s - 100.00%% full.\n", movieName);
            } else {
                System.out.printf("%s - %.2f%% full.\n", movieName,
                        (studentsCount + kidCount + standardCount) * 100.0 / freeSpaces);
            }

            movieName = scan.nextLine();
        }

        System.out.printf("Total tickets: %.0f\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", (totalStudentsCount * 100 / totalTickets));
        System.out.printf("%.2f%% standard tickets.\n", (totalStandardCount * 100 / totalTickets));
        System.out.printf("%.2f%% kids tickets.\n", (totalKidCount * 100 / totalTickets));
    }
}
