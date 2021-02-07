package whileLoop;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum = 0.0;
        boolean flag = true;
        String bankTransfer = scan.nextLine();

        while (!bankTransfer.equals("NoMoreMoney")) {
            double bankTransferNumber = Double.parseDouble(bankTransfer);
            if (bankTransferNumber < 0) {
                System.out.println("Invalid operation!");
                System.out.printf("Total: %.2f", sum);
                flag = false;
                break;
            }
            System.out.printf("Increase: %.2f\n", bankTransferNumber);
            sum += bankTransferNumber;
            bankTransfer = scan.nextLine();
        }

        if (flag) {
            System.out.printf("Total: %.2f", sum);
        }

    }
}
