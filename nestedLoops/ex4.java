package nestedLoops;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stratNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());
        int magicNumber = Integer.parseInt(scan.nextLine());

        int combinationCount = 0;
        boolean equalOrNot = false;
        int finalStartNumber = 0;
        int finalEndNumber = 0;

        for (int i = stratNumber; i <= endNumber; i++) {
            for (int j = stratNumber; j <= endNumber; j++) {
                combinationCount++;
                if (i + j == magicNumber) {
                    equalOrNot = true;
                    finalStartNumber = i;
                    finalEndNumber = j;
                    break;
                }
            }
            if (equalOrNot) {
                break;
            }
        }

        if (equalOrNot) {
            System.out.printf("Combination N:%d (%d + %d = %d)",
                    combinationCount, finalStartNumber, finalEndNumber, magicNumber);
        } else {
            System.out.printf("%d combinations - neither equals %d", combinationCount, magicNumber);
        }

    }
}
