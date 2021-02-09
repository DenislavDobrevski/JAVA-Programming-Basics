package nestedLoops_EX;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int sumPrime = 0;
        int sumNonprime = 0;
        boolean isNegative = false;

        while (!input.equals("stop")) {
            if (isNegative) {
                input = scan.nextLine();
                if(input.equals("stop")) {
                    break;
                }
            }

            int number = Integer.parseInt(input);
            isNegative = false;

            if (number <= 0) {
                isNegative = true;
                if (number == 0) {
                    continue;
                }
                System.out.println("Number is negative.");
                continue;
            }

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sumPrime += number;
            } else {
                sumNonprime += number;
            }

            input = scan.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d\n", sumNonprime);
    }
}
