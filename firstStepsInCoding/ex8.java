package firstStepsInCoding;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dogs = Double.parseDouble(scan.nextLine());
        double otherAnimals = Double.parseDouble(scan.nextLine());
        //double sum = dogs * 2.50 + otherAnimals * 4;
        dogs = dogs * 2.50;
        otherAnimals = otherAnimals * 4;
        dogs = dogs + otherAnimals;


        System.out.printf(" %d lv.", dogs);

    }
}
