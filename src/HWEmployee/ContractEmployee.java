package HWEmployee;

public class ContractEmployee extends Employee implements Pay {
    private double wage;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String federalTaxIdMember, String name, double wage) {
        super(employeeId, name);
        this.wage = wage;
        this.federalTaxIdMember = federalTaxIdMember;
    }


    @Override
    public double calculatePay() {
        return wage;
    }
}
