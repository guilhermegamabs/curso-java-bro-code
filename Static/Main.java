package Static;

public class Main {
    public static void main(String[] args) {
        Friend friend = new Friend("Guilherme");
        Friend friend2 = new Friend("Pedro");
        Friend friend3 = new Friend("Carlos");

        friend.showYourName();
        Friend.displayYourFriends();

        //System.out.println(Friend.numberOfFriends);
    }
}
