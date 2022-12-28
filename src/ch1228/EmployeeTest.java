package ch1228;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee3 employeeLee = new Employee3();
        employeeLee.setEmployeeName("이순신");

        Employee3 employeeKim = new Employee3();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + "," + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + "," + employeeKim.getEmployeeId());

        System.out.println(Employee3.getSerialNum());
    }
}
