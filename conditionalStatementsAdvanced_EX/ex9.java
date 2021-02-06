package conditionalStatementsAdvanced_EX;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String leapOrNot = scan.nextLine();
        double holidays = Double.parseDouble(scan.nextLine());
        int weekends = Integer.parseInt(scan.nextLine());

        double weekendsInSofia = 48 - weekends;
        weekendsInSofia *= 0.75;
        holidays = holidays * 2 / 3;

        double totalPlays = weekendsInSofia + holidays + weekends;

        if (leapOrNot.equals("leap")) {
            totalPlays *= 1.15;
        }

        System.out.println(Math.floor(totalPlays));
    }
}