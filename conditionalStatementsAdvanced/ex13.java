package conditionalStatementsAdvanced;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String typeOfRoom = scan.nextLine();
        String rating = scan.nextLine();

        double nights = days - 1;
        double totalPrice = 0.0;
        switch (typeOfRoom) {
            case "room for one person":
                totalPrice = nights * 18.00;
                break;
            case "apartment":
                totalPrice = nights * 25.00;
                if (days < 10) {
                    totalPrice *= 0.70;
                } else if (days <= 15) {
                    totalPrice *= 0.65;
                } else if (days > 15) {
                totalPrice *= 0.50;
            }
            break;
            case "president apartment":
                totalPrice = nights * 35.00;
                if (days < 10) {
                    totalPrice *= 0.90;
                } else if (days <= 15) {
                    totalPrice *= 0.85;
                } else if (days > 15) {
                totalPrice *= 0.80;
            }
            break;
        }

        if (rating.equals("positive")) {
            totalPrice *= 1.25;
        } else if (rating.equals("negative")) {
            totalPrice *= 0.90;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
