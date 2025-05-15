class Rectangle extends Shap implements Printable{
    double width,height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area() {
    return width*height;
    }

    public void print() {
        System.out.println("Hello this Message was printed by Hamza Ashrf");
    }
}
