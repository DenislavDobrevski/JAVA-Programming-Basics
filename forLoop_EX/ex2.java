package forLoop_EX;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int max = -1000;

        for (int i = 0; i < lenght; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }
        }
        sum -= max;
        if (max == sum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", (Math.abs(sum - max)));
        }
    }
}
