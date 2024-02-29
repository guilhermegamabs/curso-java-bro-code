import java.util.ArrayList;

public class DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("pasta");
        bakeryList.add("potato");
        bakeryList.add("ketchup");

        ArrayList<String> produceList = new ArrayList<String>();
        bakeryList.add("tomatoes");
        bakeryList.add("zucchini");
        bakeryList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<String>();
        bakeryList.add("soda");
        bakeryList.add("wine");
        bakeryList.add("coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList);
    }
}
