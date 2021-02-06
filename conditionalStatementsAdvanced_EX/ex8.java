package conditionalStatementsAdvanced_EX;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int examHour = Integer.parseInt(scan.nextLine());
        int examMinute = Integer.parseInt(scan.nextLine());
        int hourOfComing = Integer.parseInt(scan.nextLine());
        int minuteOfComing = Integer.parseInt(scan.nextLine());

        int examTimeInMinutes = 0;
        int comingTimeInMinutes = 0;

        examTimeInMinutes = (examHour * 60) + examMinute;
        comingTimeInMinutes = (hourOfComing * 60) + minuteOfComing;

        int diff = examTimeInMinutes - comingTimeInMinutes;

        int diffInMinutes = Math.abs(diff % 60);
        int diffInHours = Math.abs(diff / 60);

        if (diff <= 30 && diff >= 0) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", diffInMinutes);
            }
        } else if (diff > 30) {
            System.out.println("Early");
            if (diffInHours > 0) {
                System.out.printf("%d:%02d hours before the start", diffInHours, diffInMinutes);
            } else {
                System.out.printf("%d minutes before the start", diffInMinutes);
            }
        } else {
            System.out.println("Late");
            if (diffInHours > 0) {
                System.out.printf("%d:%02d hours after the start", diffInHours, diffInMinutes);
            } else {
                System.out.printf("%d minutes after the start", diffInMinutes);
            }
        }


    }
}
