package whileLoop_EX;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxLowGrades = Integer.parseInt(scan.nextLine());
        int lowGrades = 0;
        int problemsCount = 0;
        int sum = 0;
        boolean flag = true;
        String lastProblem = "";

        String problemName = scan.nextLine();

        while (!problemName.equals("Enough")) {
            int grade = Integer.parseInt(scan.nextLine());
            if (grade <= 4) {
                lowGrades++;
                if (lowGrades >= maxLowGrades) {
                    flag = false;
                    break;
                }
            }
            problemsCount++;
            sum += grade;
            lastProblem = problemName;

            problemName = scan.nextLine();
        }

        if (flag) {
            double avrScore = 1.00 * sum / problemsCount;
            System.out.printf("Average score: %.2f%n", avrScore);
            System.out.printf("Number of problems: %d%n", problemsCount);
            System.out.printf("Last problem: %s", lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", lowGrades);
        }

    }
}
