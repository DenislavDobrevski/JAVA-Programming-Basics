package conditionalStatements_EX;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double speed = Double.parseDouble(scan.nextLine());

        String speedReader = "";
        if (speed <= 10) {
            speedReader = "slow";
        } else if (speed <= 50) {
            speedReader = "average";
        } else if (speed <= 150) {
            speedReader = "fast";
        } else if (speed <=1000) {
            speedReader = "ultra fast";
        } else {
            speedReader = "extremely fast";
        }

        System.out.println(speedReader);
    }
}
