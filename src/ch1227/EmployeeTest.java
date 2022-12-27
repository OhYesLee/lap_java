package ch1227;

import ch1226.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee2 employeeLee = new Employee2();
        employeeLee.setEmployeeName("이순신");

        Employee2 employeeKim = new Employee2();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());

        System.out.println(Employee2.serialNum);

    }


}
