class GraduateStudent extends Student { 
    String researchTopic; 

    GraduateStudent(String name, int age, int studentId, String researchTopic) { 
        super(name, age, studentId);
        this.researchTopic = researchTopic; 
    } 
    void displayInfo() {
        super.displayInfo(); 
        System.out.println("Research Topic: " + researchTopic); 
    }
} 
