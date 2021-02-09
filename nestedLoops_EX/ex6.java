package nestedLoops_EX;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1_111; i <= 9_999; i++) {
            int currentNumber = i;
            boolean special = true;

            while (currentNumber > 0) {
                int currentDigit = currentNumber % 10;
                if (currentDigit == 0) {
                    special = false;
                    break;
                } else if (number % currentDigit != 0) {
                    special = false;
                    break;
                }

                currentNumber /= 10;
            }

            if (special) {
                System.out.printf("%d ", i);
            }

        }

    }
}
