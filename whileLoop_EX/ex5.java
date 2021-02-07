package whileLoop_EX;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double change = Double.parseDouble(scan.nextLine());
        boolean underOneLev = false;
        if (change < 1.00) {
            underOneLev = true;
        }
        int coins = 0;
        change *= 100;
        int changeStotinki = (int) change * 100;

        while (changeStotinki > 0) {
            boolean noRemaining = false;
            int changeLastValue = changeStotinki % 10;

            if (changeStotinki >= 10 || underOneLev) {
                if (changeLastValue == 1) {
                    noRemaining = true;
                } else if (changeLastValue == 2) {
                    noRemaining = true;
                } else if (changeLastValue == 5) {
                    noRemaining = true;
                } else if (changeLastValue > 5) {
                    changeStotinki -= 5;
                } else if (changeLastValue > 2) {
                    changeStotinki -= 2;
                }
            } else {
                if (changeLastValue == 1) {
                    noRemaining = true;
                } else if (changeLastValue == 2) {
                    noRemaining = true;
                } else {
                    changeStotinki -= 2;
                }
            }
            if (changeLastValue != 0) {
                coins++;
            } else {
                noRemaining = true;
            }
            if (noRemaining) {
                changeStotinki /= 10;
            }

        }

        System.out.println(coins);
    }
}
