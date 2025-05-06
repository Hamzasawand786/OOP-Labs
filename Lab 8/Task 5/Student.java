public class Student{
    private String name;
    private int rollNo;
    private char grade;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
    }

    public static void main (String[] args){
        Student s1 = new Student();
        s1.setName("Hamza Ashraf");
        s1.setRollNo(34);
        s1.setGrade('A');
        s1.displayDetails();
    }
}