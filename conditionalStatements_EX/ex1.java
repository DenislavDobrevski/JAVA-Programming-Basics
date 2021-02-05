package conditionalStatements_EX;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short firstRunner = Short.parseShort(scan.nextLine());
        short secondRunner = Short.parseShort(scan.nextLine());
        short thirdRunner = Short.parseShort(scan.nextLine());

        int allTime = firstRunner + secondRunner + thirdRunner;
        int minutes = allTime / 60;
        int seconds = allTime % 60;

        if(seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }


    }
}

