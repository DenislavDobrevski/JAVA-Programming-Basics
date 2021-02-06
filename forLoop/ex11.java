package forLoop;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = Integer.parseInt(scan.nextLine());
        double laundryPrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int toysCount = 0;
        double moneyFromBirthdays = 0.0;
        double moneyGivenForBirthday = 10.00;

        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                toysCount++;
            } else {
                moneyFromBirthdays += moneyGivenForBirthday - 1;
                moneyGivenForBirthday += 10.00;
            }
        }
        double totalMoney = moneyFromBirthdays + (toysCount * toyPrice);

        if (totalMoney >= laundryPrice) {
            System.out.printf("Yes! %.2f", (totalMoney - laundryPrice));
        } else {
            System.out.printf("No! %.2f", (laundryPrice - totalMoney));
        }

    }
}
