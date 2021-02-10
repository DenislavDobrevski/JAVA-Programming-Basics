package Exam;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String team = scan.nextLine();
        String suvenireType = scan.nextLine();
        int suvenireNumber = Integer.parseInt(scan.nextLine());

        boolean invalidStock = false;
        boolean invalidCountry = false;
        double finalSum = 0.0;

        if (team.equals("Argentina")) {
            if (suvenireType.equals("flags")) {
                finalSum = suvenireNumber * 3.25;
            } else if (suvenireType.equals("caps")) {
                finalSum = suvenireNumber * 7.20;
            } else if (suvenireType.equals("posters")) {
                finalSum = suvenireNumber * 5.10;
            } else if (suvenireType.equals("stickers")) {
                finalSum = suvenireNumber * 1.25;
            } else {
                invalidStock = true;
            }
        } else if (team.equals("Brazil")) {
            if (suvenireType.equals("flags")) {
                finalSum = suvenireNumber * 4.20;
            } else if (suvenireType.equals("caps")) {
                finalSum = suvenireNumber * 8.50;
            } else if (suvenireType.equals("posters")) {
                finalSum = suvenireNumber * 5.35;
            } else if (suvenireType.equals("stickers")) {
                finalSum = suvenireNumber * 1.20;
            } else {
                invalidStock = true;
            }
        } else if (team.equals("Croatia")) {
            if (suvenireType.equals("flags")) {
                finalSum = suvenireNumber * 2.75;
            } else if (suvenireType.equals("caps")) {
                finalSum = suvenireNumber * 6.90;
            } else if (suvenireType.equals("posters")) {
                finalSum = suvenireNumber * 4.95;
            } else if (suvenireType.equals("stickers")) {
                finalSum = suvenireNumber * 1.10;
            } else {
                invalidStock = true;
            }
        } else if (team.equals("Denmark")) {
            if (suvenireType.equals("flags")) {
                finalSum = suvenireNumber * 3.10;
            } else if (suvenireType.equals("caps")) {
                finalSum = suvenireNumber * 6.50;
            } else if (suvenireType.equals("posters")) {
                finalSum = suvenireNumber * 4.80;
            } else if (suvenireType.equals("stickers")) {
                finalSum = suvenireNumber * 0.90;
            } else {
                invalidStock = true;
            }
        } else {
            invalidCountry = true;
        }

        if (invalidCountry) {
            System.out.println("Invalid country!");
        } else if (invalidStock) {
            System.out.println("Invalid stock!");
        } else {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", suvenireNumber, suvenireType, team, finalSum);
        }

    }
}
