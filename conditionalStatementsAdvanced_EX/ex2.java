package conditionalStatementsAdvanced_EX;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int degrees = Integer.parseInt(scan.nextLine());
        String timeOfDay = scan.nextLine();

        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {
            if (timeOfDay.equals("Morning")) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (timeOfDay.equals("Afternoon") || timeOfDay.equals("Evening")){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (degrees > 18 && degrees <= 24) {
            if (timeOfDay.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (degrees >= 25 && degrees <= 42) {
            if (timeOfDay.equals("Afternoon")) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } else if (timeOfDay.equals("Morning")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (timeOfDay.equals("Evening")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        if (degrees >= 10 && degrees <= 42) {
            System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
        }
    }
}
