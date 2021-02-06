package conditionalStatementsAdvanced_EX;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flowersType = scan.nextLine();
        int flowersCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double expenses = 0.0;

        if (flowersType.equals("Roses")) {
            expenses = flowersCount * 5.0;
            if (flowersCount > 80) {
                expenses *= 0.90;
            }
        } else if (flowersType.equals("Dahlias")) {
            expenses = flowersCount * 3.80;
            if (flowersCount > 90) {
                expenses *= 0.85;
            }
        } else if (flowersType.equals("Tulips")) {
            expenses = flowersCount * 2.80;
            if (flowersCount > 80) {
                expenses *= 0.85;
            }
        } else if (flowersType.equals("Narcissus")) {
            expenses = flowersCount * 3.00;
            if (flowersCount < 120) {
                expenses *= 1.15;
            }
        } else if (flowersType.equals("Gladiolus")) {
            expenses = flowersCount * 2.50;
            if (flowersCount < 80) {
                expenses *= 1.20;
            }
        }

        if (expenses <= budget) {
            System.out.printf("Hey, you have a great garden with %d" +
                    " %s and %.2f leva left.", flowersCount, flowersType, (budget - expenses));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", (expenses - budget));
        }


    }
}
