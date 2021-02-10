package Exam;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pricePerPage = Double.parseDouble(scan.nextLine());
        double pricePerCover = Double.parseDouble(scan.nextLine());
        double percentDiscountPaper = Double.parseDouble(scan.nextLine());
        double priceDesigner = Double.parseDouble(scan.nextLine());
        double percentPaidByTeam = Double.parseDouble(scan.nextLine());

        double totalPrice = 899 * pricePerPage + 2 * pricePerCover;
        totalPrice *= (1.00 - percentDiscountPaper/100);
        totalPrice += priceDesigner;
        totalPrice *= (1.00 - percentPaidByTeam/100);

        System.out.printf("Avtonom should pay %.2f BGN.", totalPrice);

    }
}
