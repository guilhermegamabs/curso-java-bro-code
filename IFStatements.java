import java.util.Scanner;

public class IFStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your age? ");
        int age = scanner.nextInt();

        if(age == 19) {
            System.out.println("I corrected your password");
        } else if(age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are a minor!");
        }
    }
}
