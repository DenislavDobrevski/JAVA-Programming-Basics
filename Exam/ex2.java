package Exam;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double lenght = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double averageAstronautsHeight = Double.parseDouble(scan.nextLine());

        double totalSpacecraftValue = width * lenght * height;
        double oneRoomValue = 2 * 2 * (averageAstronautsHeight + 0.40);
        double totalAstronauts = Math.floor(totalSpacecraftValue / oneRoomValue);

        if(totalAstronauts < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (totalAstronauts > 10) {
            System.out.println("The spacecraft is too big.");
        } else {
            System.out.printf("The spacecraft holds %.0f astronauts.", totalAstronauts);
        }


    }
}
