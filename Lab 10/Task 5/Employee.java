abstract class Employee{
    String name;
    double id;

    Employee(String name, double id){
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}