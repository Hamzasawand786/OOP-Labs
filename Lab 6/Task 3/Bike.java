class Bike extends Vehicle {
    String helmetType;

    Bike(String brand, double speed, String helmetType) {
        super(brand, speed);
        this.helmetType = helmetType;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Type of Helmet: " + this.helmetType);
    }
}
