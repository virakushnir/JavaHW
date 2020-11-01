package HWEmployee;

public class SalariedEmployee extends Employee implements Pay{
    private String socialSecurityNumber;
    private double hourlyRate;
    private double numberofHours;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, String name, double hourlyRate, double numberofHours) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.numberofHours = numberofHours;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberofHours;
    }
}
