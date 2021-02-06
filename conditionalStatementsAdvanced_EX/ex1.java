package conditionalStatementsAdvanced_EX;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projectionType = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int colons = Integer.parseInt(scan.nextLine());

        double fullRoomIncome = 0.0;
        if (projectionType.equals("Premiere")) {
            fullRoomIncome = (rows * colons) * 12.00;
        } else if (projectionType.equals("Normal")) {
            fullRoomIncome = (rows * colons) * 7.50;
        } else if (projectionType.equals("Discount")) {
            fullRoomIncome = (rows * colons) * 5.00;
        }

        System.out.printf("%.2f leva", fullRoomIncome);
    }
}
