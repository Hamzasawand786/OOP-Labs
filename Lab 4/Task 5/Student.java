public class Student {
    int id;
    String name;
    double[] grade = new double [5];
Student(int id,String name, double [] grade){
    this.id = id;
    this.name = name;
    this.grade = grade;
}
void display_average_grade(){
    double sum = 0;
    for(int i = 0; i< grade.length; i++){
        sum+=grade[i];
    }
    double average = sum/5;
    System.out.println("Average grade of "+ name + ": " + average);
}
double [] calc_percentage(){
    double [] percent = new double[5];
    for(int i = 0; i<5; i++){
        percent[i] = (grade[i]/200)*100;
    }
    return percent;
}

String concat_id_name(){
    return id + " " + name;
}

void display_percentage(){
    double [] per = calc_percentage();
    System.out.println("Percentage of " + name + ": ");
    for(int i = 0; i<5; i++){
        System.out.println(per[i] + "%");
    }
}

public static void main (String [] args){
    double[] g1 = {150, 160, 180, 190, 160};
    double [] g2 = {190,130,170, 180, 150};

    Student s1 = new Student(1, "Hamza",g1);
    Student s2 = new Student(2, "Daniyal",g2);

    s1.display_average_grade();
    s2.display_average_grade();

    s1.display_percentage();
    s2.display_percentage();

    System.out.println("ID + Name (s1): " + s1.concat_id_name());
    System.out.println("ID + Name (s2): " + s2.concat_id_name());

}

}
