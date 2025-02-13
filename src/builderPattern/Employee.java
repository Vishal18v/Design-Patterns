package builderPattern;

public class Employee {
    private final String name;
    private final int employeeId;
    private final String dept;
    private final String mobileNo;
    private final String email;

    Employee(String name, int employeeId, String dept, String mobileNo, String email) {
        this.name = name;
        this.dept = dept;
        this.employeeId = employeeId;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return name + dept + employeeId + email + mobileNo;
    }


}
