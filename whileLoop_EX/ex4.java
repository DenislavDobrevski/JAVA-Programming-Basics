package whileLoop_EX;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalStepsPassed = 0;

        while (totalStepsPassed < 10_000) {
            String input = scan.nextLine();
            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scan.nextLine());
                totalStepsPassed += stepsToHome;
                break;
            }
            int stepsPassed = Integer.parseInt(input);
            totalStepsPassed += stepsPassed;
        }

        if (totalStepsPassed < 10_000) {
            System.out.printf("%d more steps to reach goal.", 10_000 - totalStepsPassed);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", totalStepsPassed - 10_000);
        }

    }
}
