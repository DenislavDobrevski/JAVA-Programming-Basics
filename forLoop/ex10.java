package forLoop;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < lenght; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (i % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        if (sumOdd == sumEven) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumOdd);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", (Math.abs(sumOdd - sumEven)));
        }
    }
}
