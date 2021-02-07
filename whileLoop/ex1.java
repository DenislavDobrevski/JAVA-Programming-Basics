package whileLoop;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scan.nextLine();
        }
    }
}
