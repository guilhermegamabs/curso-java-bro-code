import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cars = new String[3];

            cars[0] = "Camaro";
            cars[1] = "F50";
            cars[2] = "Porsche 911";

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
