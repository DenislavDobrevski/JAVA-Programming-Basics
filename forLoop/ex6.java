package forLoop;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int br = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                br += 1;
            } else if (text.charAt(i) == 'e') {
                br += 2;
            } else if (text.charAt(i) == 'i') {
                br += 3;
            } else if (text.charAt(i) == 'o') {
                br += 4;
            } else if (text.charAt(i) == 'u') {
                br += 5;
            }
        }

        System.out.println(br);
    }
}
