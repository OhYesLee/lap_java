package ch1227;

public class Employee2 {
    public static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee2() {
        serialNum++;
        employeeId = serialNum;
    }


}
