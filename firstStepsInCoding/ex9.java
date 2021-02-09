package firstStepsInCoding;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        area = area * 7.61;
        double discount = area * 0.18;
        area = area - discount;

        System.out.printf("The final price is: %.2f lv.", area - 0,005);
        System.out.printf("The final discount is: %.2f lv.", discount);
    }
}
