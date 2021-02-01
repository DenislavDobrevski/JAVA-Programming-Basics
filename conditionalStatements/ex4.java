package conditionalStatements;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number < 201) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("More than 200");
        }
    }
}
