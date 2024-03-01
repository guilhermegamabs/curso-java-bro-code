public class Methods {
    public static void main(String[] args) {
        String name = "Guilherme";
        int age = 19;

        hello(name, age);
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
}
