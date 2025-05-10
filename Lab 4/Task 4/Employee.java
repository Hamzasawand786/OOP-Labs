public class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;
    Employee(String name, int yearOfJoining, String address){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }
    void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Year_of_Joining: " + yearOfJoining);
        System.out.println("Address: " + address);
        System.out.println("==============================");
    }
    public static void main (String [] args){
        Employee E1 = new Employee("Robert", 1994,"WallStreet");
        E1.displayInfo();
        Employee E2 = new Employee("Sam", 2000,"WallStreet");
        E2.displayInfo();
        Employee E3 = new Employee("John", 1999,"WallStreet");
        E3.displayInfo();
    }
}