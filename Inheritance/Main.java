package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porsche", 4,99);
        Bicycle bike = new Bicycle(2, 24);

        car.go();
        car.display();

        bike.go();
        bike.display();
    }
}
