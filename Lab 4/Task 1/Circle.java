class Circle{
    double Radius ;
    String Color ;
Circle(double Radius, String Color){
    this.Radius = Radius;
    this.Color = Color;
}
    double calculateArea(){
   return Radius*Radius*Math.PI;
    }

    public static void main(String [] args){
        Circle red_circle = new Circle(34, "Red Circle");
        System.out.println("Radius of Red Circle " + red_circle.Radius);
        System.out.println("Area of Red Circle " + red_circle.calculateArea());
        Circle green_circle = new Circle(54, "Green Color");
        System.out.println("Radius of Green Circle " + green_circle.Radius);
        System.out.println("Area of Green Circle " + green_circle.calculateArea());


    }
}