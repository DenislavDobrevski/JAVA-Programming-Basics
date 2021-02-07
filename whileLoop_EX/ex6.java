package whileLoop_EX;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int lenght = Integer.parseInt(scan.nextLine());

        int cakeSize = width * lenght;
        boolean cakesLeft = false;

        while (cakeSize > 0) {
            String input = scan.nextLine();
            if (input.equals("STOP")) {
                cakesLeft = true;
                break;
            }
            int piecesTaken = Integer.parseInt(input);
            cakeSize -= piecesTaken;
        }
        if (!cakesLeft) {
            System.out.printf("No more cake left! You need %d pieces more.", (Math.abs(cakeSize)));
        } else {
            System.out.printf("%d pieces are left.", cakeSize);
        }

    }
}
