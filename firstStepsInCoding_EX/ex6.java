package firstStepsInCoding_EX;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int confectioners = Integer.parseInt(scan.nextLine());
        double cakes = Double.parseDouble(scan.nextLine());
        double waffles = Double.parseDouble(scan.nextLine());
        double pancakes = Double.parseDouble(scan.nextLine());

        double moneyTaken = days * (confectioners * ((cakes * 45) + (waffles * 5.80) + (pancakes * 3.20) ));

        moneyTaken = (moneyTaken / 8) * 7;
        System.out.printf("%.2f",moneyTaken);

    }
}
