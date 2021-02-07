package nestedLoops;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int combinationsCount = 0;

        for (number1 = 0; number1 <= input; number1++) {
            for (number2 = 0; number2 <=input; number2++) {
                for (number3 = 0; number3 <= input; number3++) {
                    if ((number1 + number2 + number3) == input) {
                        combinationsCount++;
                    }
                }
            }
        }

        System.out.println(combinationsCount);

    }
}
