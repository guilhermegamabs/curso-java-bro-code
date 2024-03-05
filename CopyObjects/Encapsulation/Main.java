package CopyObjects.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "Camaro", 2014);
        Car car2 = new Car("Ferrari", "Spider", 2024);

        car.copy(car2);

        System.out.println(car.getModel());
    }
}
