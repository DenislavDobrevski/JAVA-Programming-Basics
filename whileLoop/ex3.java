package whileLoop;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (sum < number) {
            int newNumber = Integer.parseInt(scan.nextLine());
            sum += newNumber;
        }

        System.out.println(sum);
    }
}
