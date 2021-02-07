package whileLoop;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int newNumber = 1;

        while (newNumber <= number) {
            System.out.println(newNumber);
            newNumber *= 2 + 1;
        }


    }
}