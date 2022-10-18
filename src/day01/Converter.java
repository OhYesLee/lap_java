package day01;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("화씨를 입력해주세요");
        System.out.println(" ex) 77.0 , 23.9");
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        double celsisus = (fahrenheit - 32.0) / 1.8;
        System.out.println();
        System.out.printf("화씨 %.1f 도는 섭씨로 %.1f 도 입니다.", fahrenheit, celsisus);
    }
}
