package Inheritance;

public class Bicycle extends Vehicle{
    int pedals;

    Bicycle(int pedals, int speed) {
        this.pedals = pedals;
        this.speed = speed;
    }

    void display() {
        System.out.printf("How many pedals: %d.\n Speed: %.2f Km/h.", pedals, speed);
    }

}
