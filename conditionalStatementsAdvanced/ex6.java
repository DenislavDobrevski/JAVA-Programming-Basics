package conditionalStatementsAdvanced;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        String numberInterval = "No";

        if(number >= -100 && number <= 100 && number != 0){
            numberInterval = "Yes";
        }

        System.out.println(numberInterval);



    }
}
