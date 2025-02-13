package builderPattern;

public class EmployeeBuilder {
    private String name;
    private int employeeId;
    private String dept;
    private String mobileNo;
    private String email;

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public EmployeeBuilder setDept(String dept) {
        this.dept = dept;
        return this;
    }

    public EmployeeBuilder setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }

    public EmployeeBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Employee createEmployee() {
        return new Employee(name, employeeId, dept, mobileNo, email);
    }
}