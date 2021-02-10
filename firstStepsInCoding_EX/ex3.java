package firstStepsInCoding_EX;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double depositedAmount = Double.parseDouble(scan.nextLine());
        int depositeTerm = Integer.parseInt(scan.nextLine());
        double interestRate = Double.parseDouble(scan.nextLine());

        double amount = depositedAmount + depositeTerm * ((depositedAmount * (interestRate/100)) / 12);

        System.out.println(amount);

    }
}
