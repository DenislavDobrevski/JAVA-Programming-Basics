package firstStepsInCoding_EX;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double rent = Double.parseDouble(scan.nextLine());

        double cake = rent * 0.2;
        double drinks = cake * 0.55;
        double animator = rent / 3;

        double budget = rent + cake + drinks + animator;

        System.out.println(budget);

    }
}
