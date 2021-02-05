package conditionalStatementsAdvanced;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String dayOfTheWeek = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());

        double price = 0.0;

        switch (dayOfTheWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    price = 2.50 * amount;
                } else if (fruit.equals("apple")) {
                    price = 1.20 * amount;
                } else if (fruit.equals("orange")) {
                    price = 0.85 * amount;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.45 * amount;
                } else if (fruit.equals("kiwi")) {
                    price = 2.70 * amount;
                } else if (fruit.equals("pineapple")) {
                    price = 5.50 * amount;
                } else if (fruit.equals("grapes")) {
                    price = 3.85 * amount;
                }
                break;
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    price = 2.70 * amount;
                } else if (fruit.equals("apple")) {
                    price = 1.25 * amount;
                } else if (fruit.equals("orange")) {
                    price = 0.90 * amount;
                } else if (fruit.equals("grapefruit")) {
                    price = 1.60 * amount;
                } else if (fruit.equals("kiwi")) {
                    price = 3.00 * amount;
                } else if (fruit.equals("pineapple")) {
                    price = 5.60 * amount;
                } else if (fruit.equals("grapes")) {
                    price = 4.20 * amount;
                }
                break;
        }
        if (price != 0.0) {
            System.out.printf("%.2f", price);
        } else {
            System.out.println("error");
        }

    }
}

