package nestedLoops_EX;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int trainers = Integer.parseInt(scan.nextLine());
        String presentation = scan.nextLine();
        double totalAvrGrade = 0.0;
        int totalGradesNumber = 0;

        while (!presentation.equals("Finish")) {
            double avrGrade = 0.0;

            for (int i = 0; i < trainers; i++) {
                double grade = Double.parseDouble(scan.nextLine());
                avrGrade += grade;
            }

            avrGrade /= trainers;
            totalAvrGrade += avrGrade;
            totalGradesNumber++;

            System.out.printf("%s - %.2f.\n", presentation, avrGrade);
            presentation = scan.nextLine();
        }
        totalAvrGrade /= totalGradesNumber;
        System.out.printf("Student's final assessment is %.2f.", totalAvrGrade);


    }
}
