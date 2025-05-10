public class Employee {
    String name;
    int empID;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }

    // Method to increase salary by a given amount
    void increaseSalary(double amount) {
        salary += amount; // Fixed missing semicolon
        System.out.println("Your salary increased by $" + amount + ". New salary: $" + salary);
    }

    // Method to calculate annual salary
    double calculateAnnualSalary() {
        return salary * 12;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empID);
        System.out.println("Monthly Salary:" + salary);
    }

    // Main method to test functionality
    public static void main(String[] args) {
        Employee e1 = new Employee("Hamza", 101, 5000);

        e1.increaseSalary(2000);
        e1.displayDetails();
        System.out.println("Annual Salary: $" + e1.calculateAnnualSalary());
    }
}