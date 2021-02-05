package conditionalStatements_EX;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        String distanceInput = scan.nextLine();
        String distanceOutput = scan.nextLine();

        if (distanceInput.equals("mm")) {
            if (distanceOutput.equals("cm")) {
                System.out.printf("%.3f", number / 10);
            } else if (distanceOutput.equals("m")) {
                System.out.printf("%.3f", number / 1000);
            }
        } else if (distanceInput.equals("cm")) {
            if (distanceOutput.equals("mm")) {
                System.out.printf("%.3f", number * 10);
            } else if (distanceOutput.equals("m")) {
                System.out.printf("%.3f", number / 100);
            }
        } else {
            if (distanceOutput.equals("cm")) {
                System.out.printf("%.3f", number * 100);
            } else if (distanceOutput.equals("mm")) {
                System.out.printf("%.3f", number * 1000);
            }
        }


    }
}
