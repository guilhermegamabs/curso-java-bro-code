public class StringMethods {
    public static void main(String[] args) {
        String name = "Guilherme";
        boolean result = name.equalsIgnoreCase("guilherme");
        int result1 = name.length();
        char result2 = name.charAt(0);
        int result3 = name.indexOf("i");
        boolean result4 = name.isEmpty();
        String result5 = name.trim();
        String result6 = name.replace('i', 'o');


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}
