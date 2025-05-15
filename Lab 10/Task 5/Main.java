public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Hamza", 1, 500000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Sawand", 2, 50.0, 160);
        double fullTimeSalary = fullTimeEmployee.calculateSalary();
        double partTimeSalary = partTimeEmployee.calculateSalary();

        System.out.println("Full-time employee salary: " + fullTimeSalary);
        System.out.println("Part-time employee salary: " + partTimeSalary);
        double taxRate = 0.1;
        fullTimeEmployee.payTax(fullTimeSalary * taxRate);
        partTimeEmployee.payTax(partTimeSalary * taxRate);
    }
}