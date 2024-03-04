package Static;

public class Friend {
    String name;
    static int numberOfFriends;
    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    void showYourName() {
        System.out.printf("My name is %s.\n", name);
    }

    static void displayYourFriends() {
        System.out.printf("I have %d friends.", numberOfFriends);
    }

}
