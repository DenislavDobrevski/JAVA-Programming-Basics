package Exam;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int availableFood = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        int gramsEaten = 0;

        while (!input.equals("Adopted")) {
            int gramsPerDay = Integer.parseInt(input);
            gramsEaten += gramsPerDay;
            input = scan.nextLine();
        }

        availableFood *= 1000;
        if (gramsEaten > availableFood) {
            System.out.printf("Food is not enough. You need %d grams more.", gramsEaten - availableFood);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", availableFood - gramsEaten);
        }
    }
}
