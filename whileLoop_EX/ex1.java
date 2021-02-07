package whileLoop_EX;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String book = scan.nextLine();

        boolean flag = false;
        int br = 0;
        String availableBooks = scan.nextLine();

        while (!availableBooks.equals("No More Books")) {
            if (availableBooks.equals(book)) {
                flag = true;
                break;
            }
            br++;
            availableBooks = scan.nextLine();
        }

        if (flag) {
            System.out.printf("You checked %d books and found it.", br);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", br);
        }
    }
}
