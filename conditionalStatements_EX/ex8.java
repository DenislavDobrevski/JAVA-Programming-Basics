package conditionalStatements_EX;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double income = Double.parseDouble(scan.nextLine());
        double averageGrade = Double.parseDouble(scan.nextLine());
        double minimalSalary = Double.parseDouble(scan.nextLine());

        double socialScholarship = 0.00;
        double scholarship = 0.00;

        if (income < minimalSalary && averageGrade >= 4.50) {
            socialScholarship = minimalSalary * 0.35;
        }

        if (averageGrade >= 5.50) {
            scholarship = averageGrade * 25;
        }

        if (scholarship != 0.00 || socialScholarship != 0.00) {
            if (scholarship < socialScholarship) {
                System.out.printf("You get a Social scholarship %.0f BGN", (Math.floor(socialScholarship)));
            } else if (scholarship > socialScholarship) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", (Math.floor(scholarship)));
            }
        } else {
            System.out.println("You cannot get a scholarship!");
        }

    }
}
