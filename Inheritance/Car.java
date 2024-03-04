package Inheritance;

public class Car extends Vehicle{
    String model;
    int doors;

    Car(String model, int doors, double speed) {
        this.model = model;
        this.doors = doors;
        this.speed = speed;
    }

    void display() {
        System.out.printf("Model: %s.\n How many doors: %d.\n Speed: %.2f Km/h.", model, doors, speed);
    }


}
