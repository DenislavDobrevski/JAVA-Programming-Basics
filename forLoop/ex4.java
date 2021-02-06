package forLoop;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                if ((Math.pow(2, number)) >= (Math.pow(2, i))) {
                    System.out.println((int)Math.pow(2, i));
                }
            }
        }
    }
}
