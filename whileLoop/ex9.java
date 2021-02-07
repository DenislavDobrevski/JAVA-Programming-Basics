package whileLoop;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int lenght = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        String boxes = scan.nextLine();

        int freeSpace = width * lenght * height;
        int totalBoxesSpace = 0;
        boolean flag = true;

        while (!boxes.equals("Done")) {
            int boxesDigit = Integer.parseInt(boxes);
            totalBoxesSpace += boxesDigit;
            if (totalBoxesSpace > freeSpace) {
                System.out.printf("No more free space! You need " +
                        "%d Cubic meters more.", (totalBoxesSpace - freeSpace));
                flag = false;
                break;
            }
            boxes = scan.nextLine();
        }
        if (flag) {
            System.out.printf("%d Cubic meters left.", (freeSpace - totalBoxesSpace));
        }

    }
}
