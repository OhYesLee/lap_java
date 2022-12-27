package ch1227;

import ch1226.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        ch1226.Employee employeeLee = new ch1226.Employee();
        employeeLee.setEmployeeName("이순신");
        System.out.println(employeeLee.serialNum);

        ch1226.Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.serialNum++;

        System.out.println(employeeLee.serialNum);
        System.out.println(employeeKim.serialNum);

    }

}
