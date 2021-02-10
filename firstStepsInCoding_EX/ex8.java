package firstStepsInCoding_EX;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        double volume = length * width * height;
        double liters = volume * 0.001;
        liters = liters * (1 - (percent/100));

        System.out.printf("%.2f", liters);

    }
}
