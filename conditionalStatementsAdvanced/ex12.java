package conditionalStatementsAdvanced;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String city = scan.nextLine();
        double sells = Double.parseDouble(scan.nextLine());
        double poundage = 0.0;

        if (sells >= 0) {
            switch (city) {
                case "Sofia":
                    if (sells <= 500) {
                        poundage = sells * 0.05;
                    } else if (sells <= 1000) {
                        poundage = sells * 0.07;
                    } else if (sells <= 10000) {
                        poundage = sells * 0.08;
                    } else {
                        poundage = sells * 0.12;
                    }
                    break;
                case "Varna":
                    if (sells <= 500) {
                        poundage = sells * 0.045;
                    } else if (sells <= 1000) {
                        poundage = sells * 0.075;
                    } else if (sells <= 10000) {
                        poundage = sells * 0.10;
                    } else {
                        poundage = sells * 0.13;
                    }
                    break;
                case "Plovdiv":
                    if (sells <= 500) {
                        poundage = sells * 0.055;
                    } else if (sells <= 1000) {
                        poundage = sells * 0.08;
                    } else if (sells <= 10000) {
                        poundage = sells * 0.12;
                    } else {
                        poundage = sells * 0.145;
                    }
                    break;
            }
        }
        if (poundage != 0.0) {
            System.out.printf("%.2f", poundage);
        } else {
            System.out.println("error");
        }


    }
}
