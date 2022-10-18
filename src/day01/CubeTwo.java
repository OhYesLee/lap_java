package day01;

import java.util.Scanner;

public class CubeTwo {
    public static void main(String[] args) {
        System.out.println("직육면체 한변의 길이를 각각 입력하시오. ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("직육면체 가로의 길이를 입력하시오. ");
        int n1 = scanner.nextInt();
        System.out.println("직육면체 세로의 길이를 입력하시오. ");
        int n2 = scanner.nextInt();
        System.out.println("직육면체 높이의 길이를 입력하시오. ");
        int n3 = scanner.nextInt();
        int v = volume(n1,n2,n3);
        System.out.printf("가로 변의 길이가 %d, 세로 변의 길이가 %d, 높이 변의 길이가 %d 인 직육면체의 부피는 : %d 입니다.  ", n1, n2,n3, v);

    }

    private static int volume(int length1, int length2, int length3) {

        return length1 * length2 * length3;
    }


}
