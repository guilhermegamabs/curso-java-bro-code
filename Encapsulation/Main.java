package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "Camaro", 2014);
        car.setMake("Ford");
        System.out.println(car.getMake());
    }
}
