package nestedLoops_EX;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int rows = 1;
        boolean isBigger = false;
        for (int i = 1; i <= number; ) {

            for (int b = 1; b <= rows; b++) {
                if (i > number) {
                    isBigger = true;
                    break;
                }
                System.out.printf("%d ", i);
                  i++;
            }
            if (isBigger) {
                break;
            }
            System.out.println();
            rows++;
        }

    }
}
