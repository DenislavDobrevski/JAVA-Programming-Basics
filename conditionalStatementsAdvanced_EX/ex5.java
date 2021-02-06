package conditionalStatementsAdvanced_EX;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        double expenses = 0.0;

        String destination = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                expenses = budget * 0.30;
            } else if (season.equals("winter")) {
                expenses = budget * 0.70;
            }
        } else if (budget <= 1_000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                expenses = budget * 0.40;
            } else if (season.equals("winter")) {
                expenses = budget * 0.80;
            }
        } else {
            destination = "Europe";
            expenses = budget * 0.90;
        }

        String place = "";
        if (season.equals("summer") && (!destination.equals("Europe"))) {
            place = "Camp";
        } else {
            place = "Hotel";
        }

        System.out.println(String.format("Somewhere in %s", destination));
        System.out.printf("%s - %.2f", place, expenses);

    }
}
