package ch1219;

public class StudentTest2 {
    public static void main(String[] args) {

        //Student studentLee = new Student();

        Student2 studentLee2 = new Student2(12345, "Lee", 3);

        String data = studentLee2.showStudentInfo();
        System.out.println(data);
    }

}
