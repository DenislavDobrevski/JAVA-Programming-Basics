package whileLoop;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        double rating = Double.parseDouble(scan.nextLine());
        int grade = 1;
        int strikes = 0;
        boolean flag = true;
        double avrGrade = 0.0;


        while (grade <= 12) {
            if (rating < 4.00) {
                strikes++;
                if (strikes > 1) {
                    System.out.printf("%s has been excluded at %d grade", name, grade);
                    flag = false;
                    break;
                }
            } else {
                avrGrade += rating;
                grade++;
            }
            if (grade != 13)
            rating = Double.parseDouble(scan.nextLine());
        }

        if (flag) {
            System.out.printf("%s graduated. Average grade: %.2f", name, (avrGrade / 12));
        }

    }
}
