package conditionalStatements;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String figure = scan.nextLine();
        double area;
        if (figure.equals("square")) {
            double a = Double.parseDouble(scan.nextLine());
            area = a * a;
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            area = a * b;
        } else if (figure.equals("circle")){
           double r = Double.parseDouble(scan.nextLine());
            area = r * r * Math.PI;
        } else {
            double a = Double.parseDouble(scan.nextLine());
            double h = Double.parseDouble(scan.nextLine());
            area = a * h / 2;
        }

        System.out.printf("%.3f",area);
    }
}
