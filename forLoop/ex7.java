package forLoop;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lenght = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < lenght; i++) {
            int number = Integer.parseInt(scan.nextLine());
            sum += number;
        }
        System.out.println(sum);
    }
}
