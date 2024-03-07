package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.printf("Result: %d", z);
        } catch (ArithmeticException error) {
            System.out.println("You can't divide by zero! " + error);
        } catch (InputMismatchException error) {
            System.out.println("Please enter a number! " + error);
        } catch (Exception error) {
            System.out.println("Something went wrong! " + error);
        } finally {
            System.out.println("This will always execute!");
            scanner.close();
        }
    }
}
