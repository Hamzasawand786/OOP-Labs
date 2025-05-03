class Vehicle {
    String brand;
    double speed;

    Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Speed: " + speed);
    }
}
