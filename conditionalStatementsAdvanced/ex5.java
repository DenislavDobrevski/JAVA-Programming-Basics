package conditionalStatementsAdvanced;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String city = scan.nextLine();
        double amount = Double.parseDouble(scan.nextLine());

        double price = 0.0;


        switch (city) {
            case "Sofia":
                if (product.equals("coffee")) {
                    price = 0.50 * amount;
                } else if (product.equals("water")) {
                    price = 0.80 * amount;
                } else if (product.equals("beer")) {
                    price = 1.20 * amount;
                } else if (product.equals("sweets")) {
                    price = 1.45 * amount;
                } else if (product.equals("peanuts")) {
                    price = 1.60 * amount;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    price = 0.40 * amount;
                } else if (product.equals("water")) {
                    price = 0.70 * amount;
                } else if (product.equals("beer")) {
                    price = 1.15 * amount;
                } else if (product.equals("sweets")) {
                    price = 1.30 * amount;
                } else if (product.equals("peanuts")) {
                    price = 1.50 * amount;
                }
                break;

            case "Varna":
                if (product.equals("coffee")) {
                    price = 0.45 * amount;
                } else if (product.equals("water")) {
                    price = 0.70 * amount;
                } else if (product.equals("beer")) {
                    price = 1.10 * amount;
                } else if (product.equals("sweets")) {
                    price = 1.35 * amount;
                } else if (product.equals("peanuts")) {
                    price = 1.55 * amount;
                }
                break;
        }
        System.out.println(price);
    }
    }
