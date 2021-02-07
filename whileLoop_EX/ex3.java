package whileLoop_EX;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyForVacation = Double.parseDouble(scan.nextLine());
        double availableMoney = Double.parseDouble(scan.nextLine());
        int spendingDaysStreak = 0;
        boolean flag = true;
        int daysGone = 0;

        while (availableMoney < moneyForVacation) {
            String spentOrSaved = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            daysGone++;

            if (spentOrSaved.equals("save")) {
                availableMoney += money;
                spendingDaysStreak = 0;
            } else {
                availableMoney -= money;
                if (availableMoney < 0) {
                    availableMoney = 0;
                }
                spendingDaysStreak++;
                if (spendingDaysStreak >= 5) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.printf("You saved the money for %d days.", daysGone);
        } else {
            System.out.println("You can't save the money.");
            System.out.println(daysGone);
        }

    }
}
