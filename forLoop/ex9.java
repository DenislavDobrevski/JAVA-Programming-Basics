package forLoop;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0; i < lenght; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sumOne += number;
        }
        for (int i = 0; i < lenght; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sumTwo += number;
        }

        if (sumOne == sumTwo) {
            System.out.printf("Yes, sum = %d", sumOne);
        } else {
            System.out.printf("No, diff = %d", (Math.abs(sumOne - sumTwo)));
        }

    }
}
