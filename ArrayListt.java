import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hotdog");
        food.add("hamburguer");

        food.set(0, "PIZZA");
        food.remove(1);

        for (int i=0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
}
