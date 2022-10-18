package day01;
//////별찍기//////

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
//                System.out.println("@");
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
