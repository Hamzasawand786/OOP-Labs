class FullTimeEmployee extends Employee implements TaxPayer{
private double monthlysalary;

public FullTimeEmployee(String name, double id, double monthlysalary){
super(name, id);
this.monthlysalary = monthlysalary;
    }

    public double calculateSalary(){
    return monthlysalary;
    }

    public void payTax(double amount){
        System.out.println(name + "(Full- Time ) paid Tax: $ " + amount);
    }
}