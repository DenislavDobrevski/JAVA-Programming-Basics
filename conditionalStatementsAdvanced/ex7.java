package conditionalStatementsAdvanced;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int time = Integer.parseInt(scan.nextLine());
        String dayOfWeek = scan.nextLine();

        if (time >= 10 && time <= 18 && (!dayOfWeek.equals("Sunday"))) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
