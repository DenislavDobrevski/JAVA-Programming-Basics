package conditionalStatementsAdvanced_EX;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());
        double studio = 0.0;
        double apartment = 0.0;

        if (month.equals("May") || month.equals("October")) {
            studio = nights * 50.00;
            apartment = nights * 65.00;
            if (nights > 7 && nights <= 14) {
                studio *= 0.95;
            } else if (nights > 14) {
                studio *= 0.70;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studio = nights * 75.20;
            apartment = nights * 68.70;
            if (nights > 14) {
                studio *= 0.80;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studio = nights * 76.00;
            apartment = nights * 77.00;
        }
        if (nights > 14) {
            apartment *= 0.90;
        }
        System.out.println(String.format("Apartment: %.2f lv.", apartment));
        System.out.printf("Studio: %.2f lv.", studio);

    }
}
