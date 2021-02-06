package conditionalStatementsAdvanced_EX;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fishersCount = Integer.parseInt(scan.nextLine());

        double expenses = 0.0;

        if (season.equals("Spring")) {
            expenses = 3_000;
        } else if (season.equals("Winter")) {
            expenses = 2_600;
        } else {
            expenses = 4_200;
        }

        if (fishersCount <= 6) {
            expenses *= 0.90;
        } else if (fishersCount <= 11) {
            expenses *= 0.85;
        } else {
            expenses *= 0.75;
        }

        if (!season.equals("Autumn") && (fishersCount % 2 == 0)) {
            expenses *= 0.95;
        }

        if (budget >= expenses) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - expenses));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (expenses - budget));
        }

    }
}
