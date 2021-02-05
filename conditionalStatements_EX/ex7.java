package conditionalStatements_EX;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double secondsPerMeter = Double.parseDouble(scan.nextLine());

        double newTime = secondsPerMeter * distance;
        newTime += (Math.floor(distance / 15)) * 12.5;

        if (newTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", newTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (newTime - record));
        }
    }
}
