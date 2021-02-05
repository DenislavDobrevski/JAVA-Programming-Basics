package conditionalStatements_EX;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        double bonusPointsOne = 0.0;

        if (number <= 100) {
            bonusPointsOne += 5;
        } else if (number <= 1000) {
            bonusPointsOne = number * 0.20;
        } else {
            bonusPointsOne = number * 0.10;
        }

        double bonusPointsTwo = 0.0;

        if ((number % 2) == 0) {
            bonusPointsTwo++;
        } else if ((number % 10) == 5) {
            bonusPointsTwo += 2;
        }

        System.out.printf("%.1f \n", (bonusPointsOne + bonusPointsTwo));
        System.out.printf("%.1f", (number + bonusPointsOne + bonusPointsTwo));
    }
}
