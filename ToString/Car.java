package ToString;

public class Car {
    String make = "Porsche";
    String model = "Porsche 911 Carrera GTS";
    int year = 2023;
    String color = "red";
    double price = 5500000.00;

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
