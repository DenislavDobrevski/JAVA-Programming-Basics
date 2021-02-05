package conditionalStatements_EX;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int extrasCount = Integer.parseInt(scan.nextLine());
        double clothingPrice = Double.parseDouble(scan.nextLine());

        double decor = budget * 0.10;
        clothingPrice = clothingPrice * extrasCount;

        if (extrasCount > 150) {
            clothingPrice *= 0.90;
        }

        if ((decor + clothingPrice) > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", (decor + clothingPrice) - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - (decor + clothingPrice));
        }
    }
}
