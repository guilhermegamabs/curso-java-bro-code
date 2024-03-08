package FileWriter;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red");
            writer.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
