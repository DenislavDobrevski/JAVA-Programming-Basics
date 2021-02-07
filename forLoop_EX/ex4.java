package forLoop_EX;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers = Integer.parseInt(scan.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;

        for (int i = 0; i < numbers; i++) {
            int number = Integer.parseInt(scan.nextLine());
            if (number < 200) {
                p1++;
            } else if (number < 400) {
                p2++;
            } else if (number < 600) {
                p3++;
            } else if (number < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f%%\n", (p1 / numbers * 100));
        System.out.printf("%.2f%%\n", (p2 / numbers * 100));
        System.out.printf("%.2f%%\n", (p3 / numbers * 100));
        System.out.printf("%.2f%%\n", (p4 / numbers * 100));
        System.out.printf("%.2f%%\n", (p5 / numbers * 100));
    }
}
