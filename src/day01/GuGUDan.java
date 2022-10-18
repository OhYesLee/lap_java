package day01;

public class GuGUDan {
    public static void PrintGuGuDan() {
        for (int n = 2; n <= 9; n++) {
            printDan(n);
        }
    }

    private static void printDan(int dan) {
        System.out.printf("%d 단/n", dan);
        for (int i = 1; i <= 9; i++) {
            System.out.printf("\t");
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }
}
