package ch1210;

public class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass(); // 내부 클래스 생성
    }

    class InClass {

        int inNum = 100;
        //static int sInNum = 200;  //에러 남

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
        }

        //static void sTest(){  //에러 남

        //}

    }

    public void usingClass() {
        inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
    }

}
