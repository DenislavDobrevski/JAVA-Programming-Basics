package nestedLoops;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.println(String.format("%d:%d", i, j));
            }
        }
    }
}
