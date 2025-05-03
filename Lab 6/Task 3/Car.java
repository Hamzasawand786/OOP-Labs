class Car extends Vehicle {
    int numDoors;

    Car(String brand, double speed, int numDoors) {
        super(brand, speed);
        this.numDoors = numDoors;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Number of Doors in Car: " + this.numDoors);
    }

}