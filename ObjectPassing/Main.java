package ObjectPassing;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("Porsche");
        Car car2 = new Car("BMW");


        garage.park(car);
        garage.park(car2);


    }
}
