package HWEmployee;

public class Main {
    public static void main(String[] args) {
        Employee[] array = new Employee[5];

        array[0] = new SalariedEmployee("01", "2905","Vira", 42, 198);
        array[1] = new SalariedEmployee("02", "2233","Bohdan", 40, 265);
        array[2] = new ContractEmployee("03", "9493","Ivan", 12400);
        array[3] = new ContractEmployee("04","0804", "Kateryna", 16500);


        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length-1; j++)
                if (array[j].calculatePay() > array[i].calculatePay()) {
                    array[array.length - 1] = array[i];
                    array[i] = array[j];
                    array[j] = array[array.length - 1];
                }
        }


        for (int i = 0; i < array.length-1; i++) {
            System.out.println("ID:" + array[i].employeeId +
                    ", name: " + array[i].name + ", wage: " + array[i].calculatePay());

        }

    }
}
