package firstStepsInCoding_EX;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double strawberriesPrice = Double.parseDouble(scan.nextLine());
        double bananas = Double.parseDouble(scan.nextLine());
        double oranges = Double.parseDouble(scan.nextLine());
        double raspberries = Double.parseDouble(scan.nextLine());
        double strawberries = Double.parseDouble(scan.nextLine());

        double raspberriesPrice = strawberriesPrice * 0.50;
        double orangesPrice = raspberriesPrice * 0.60;
        double bananasPrice = raspberriesPrice * 0.20;

        double moneyNeeded = strawberriesPrice * strawberries + raspberriesPrice * raspberries + bananasPrice * bananas + orangesPrice * oranges;
        System.out.printf("%.2f", moneyNeeded);


    }
}
