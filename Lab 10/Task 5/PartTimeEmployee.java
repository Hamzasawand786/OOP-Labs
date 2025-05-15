class PartTimeEmployee extends Employee implements TaxPayer{
double hourlyRate;
int hourWorked;

PartTimeEmployee(String name, double id, double hourlyRate,int hourWorked){
    super(name, id);
    this.hourlyRate = hourlyRate;
    this.hourWorked = hourWorked;
}

    @Override
    double calculateSalary() {
        return hourWorked*hourlyRate;
    }

    @Override
    public void payTax(double amount) {
        System.out.println(name + " (Part-time) paid tax: $" + amount);
    }
}