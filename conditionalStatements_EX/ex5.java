package conditionalStatements_EX;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int timeInMinutes = hours * 60 + minutes + 15;
        hours = timeInMinutes / 60;
        minutes = timeInMinutes % 60;

        if (hours > 23) {
            hours = 0;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
