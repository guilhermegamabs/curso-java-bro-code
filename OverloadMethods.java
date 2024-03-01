public class OverloadMethods {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 4;

        System.out.println(add(a, b, c));
    }


    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}
