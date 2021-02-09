package nestedLoops_EX;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        for (int currentNumber = firstNumber; currentNumber <= secondNumber; currentNumber++) {

            int sumEven = 0;
            int sumOdd = 0;
            int digit = currentNumber;

            for (int i = 7; i > 1; i--) {

                if (i % 2 == 0) {
                    sumEven += digit % 10;
                } else {
                    sumOdd += digit % 10;
                }

                digit /= 10;
            }

            if (sumEven == sumOdd && sumEven != 0) {
                System.out.printf("%d ", currentNumber);
            }

        }


    }
}
