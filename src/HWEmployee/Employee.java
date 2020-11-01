package HWEmployee;

public class Employee implements Pay {
    public String employeeId;
    public String name;
    public double wage;


    public Employee (String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public double calculatePay() {
        return wage;
    }
}
