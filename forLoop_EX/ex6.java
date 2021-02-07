package forLoop_EX;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int openedBrowsers = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        boolean flag = true;

        for (int i = 0; i < openedBrowsers; i++) {
            String tab = scan.nextLine();
            if (tab.equals("Facebook")) {
                salary -= 150;
            } else if (tab.equals("Instagram")) {
                salary -= 100;
            } else if (tab.equals("Reddit")) {
                salary -= 100;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(salary);
        }
    }
}
