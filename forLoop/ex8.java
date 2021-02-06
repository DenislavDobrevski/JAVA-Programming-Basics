package forLoop;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int min = 10000;
        int max = -10000;

        for (int i = 0; i < lenght; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number > max) {
                max = number;
            }
            if (number < min ) {
                min = number;
            }
        }
        System.out.println(String.format("Max number: %d", max));
        System.out.println(String.format("Min number: %d", min));
    }
}
