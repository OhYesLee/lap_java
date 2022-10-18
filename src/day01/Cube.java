package day01;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        System.out.println("정육면체 한변의 길이를 입력하시오. ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int v = volume(n);
        System.out.printf("한 변의 길이가 %d 인 정육면체의 부피는 : %d",n,v);

    }

    private static int volume(int length) {
        return length*length*length;
    }


}
