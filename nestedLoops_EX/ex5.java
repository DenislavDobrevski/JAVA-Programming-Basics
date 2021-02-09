package nestedLoops_EX;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int l = Integer.parseInt(scan.nextLine());

        for (int firstSymbol = 1; firstSymbol < n; firstSymbol++) {
            for (int secondSymbol = 1; secondSymbol < n; secondSymbol++) {
                for (char thirdSymbol = 97; thirdSymbol < (97 + l); thirdSymbol++) {
                    for (char forthSymbol = 97; forthSymbol < (97 + l); forthSymbol++) {
                        for (int fifthSymbol = (firstSymbol + 1); fifthSymbol <= n; fifthSymbol++) {
                            while (fifthSymbol <= secondSymbol) {
                                fifthSymbol++;
                            }
                            System.out.printf("%d%d%c%c%d ", firstSymbol, secondSymbol, thirdSymbol, forthSymbol, fifthSymbol);
                        }
                    }
                }
            }
        }


    }
}
