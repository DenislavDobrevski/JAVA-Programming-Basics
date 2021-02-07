package forLoop_EX;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers = Integer.parseInt(scan.nextLine());
        double oddSum = 0.0;
        double oddMin = 1000;
        double oddMax = -1000;
        double evenSum = 0.0;
        double evenMin = 1000;
        double evenMax = -1000;

        for (int i = 1; i <= numbers; i++) {
            double number = Double.parseDouble(scan.nextLine());
            if (i % 2 != 0) {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            } else {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,\n",oddSum);
        if (oddMin == 1000) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,\n",oddMin);
            System.out.printf("OddMax=%.2f,\n",oddMax);
        }
        System.out.printf("EvenSum=%.2f,\n",evenSum);
        if (evenMin == 1000) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,\n",evenMin);
            System.out.printf("EvenMax=%.2f\n",evenMax);
        }

    }
}
