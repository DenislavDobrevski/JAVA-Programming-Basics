package conditionalStatementsAdvanced_EX;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        char operator = scan.nextLine().charAt(0);

        int result = 0;
        String oddOrEven = "";

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                if (result % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%d + %d = %d - %s", firstNumber, secondNumber, result, oddOrEven);
                break;
            case '-':
                result = firstNumber - secondNumber;
                if (result % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%d - %d = %d - %s", firstNumber, secondNumber, result, oddOrEven);
                break;
            case '*':
                result = firstNumber * secondNumber;
                if (result % 2 == 0) {
                    oddOrEven = "even";
                } else {
                    oddOrEven = "odd";
                }
                System.out.printf("%d * %d = %d - %s", firstNumber, secondNumber, result, oddOrEven);
                break;
            case '%':
                if (secondNumber == 0) {
                    System.out.printf("Cannot divide %d by zero", firstNumber);
                } else {
                    result = firstNumber % secondNumber;
                    System.out.printf("%d %% %d = %d", firstNumber, secondNumber, result);
                }
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.printf("Cannot divide %d by zero", firstNumber);
                } else {
                    double floatingResult = (1.00 * firstNumber) / secondNumber;
                    System.out.printf("%d / %d = %.2f", firstNumber, secondNumber, floatingResult);
                }
                break;
        }
    }
}
