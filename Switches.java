import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day: ");
        String day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "sunday":
                System.out.println("It's Sunday!");
                break;
            case "monday":
                System.out.println("It's Monday!");
                break;
            case "tuesday":
                System.out.println("It's Tuesday!");
                break;
            case "wednesday":
                System.out.println("It's Wednesday!");
                break;
            case "thursday":
                System.out.println("It's Thursday!");
                break;
            case "friday":
                System.out.println("It's Friday!");
                break;
            case "saturday":
                System.out.println("It's Saturday!");
                break;
        }
    }
}
