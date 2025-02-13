package builderPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeBuilder builder = new EmployeeBuilder();
        Employee e1 = builder.setName("vishal").setDept("ads").setEmployeeId(546).createEmployee();
        System.out.println(e1.toString());
    }
}
