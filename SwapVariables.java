public class SwapVariables {
    public static void main(String[] args) {
        String x = "water";
        String y = "oil";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
