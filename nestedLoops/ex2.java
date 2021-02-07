package nestedLoops;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(String.format("%d * %d = %d", i, j, (i * j)));
            }
        }
    }
}
