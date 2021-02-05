package conditionalStatementsAdvanced;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();

        String address = "";

        if (age > -1) {
            if (gender.equals("m")) {
                if (age < 16) {
                    address = "Master";
                } else {
                    address = "Mr.";
                }
            } else if (gender.equals("f")) {
                if (age < 16) {
                    address = "Miss";
                } else {
                    address = "Ms.";
                }
            }
        }

        System.out.println(address);
    }
}
