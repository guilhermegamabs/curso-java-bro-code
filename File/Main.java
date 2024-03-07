package File;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Guilherme\\IdeaProjects\\test\\src\\File\\secret.txt");

        if(file.exists()) {
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
        } else {
            System.out.println("That file doesn't exists!");
        }
    }
}
