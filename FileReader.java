import java.io.FileNotFoundException;

public class FileReader {
    public static void main(String[] args) {
        FileReader reader = new FileReader("art.txt");
        int data = reader.read();
        while (data != -1) {
            System.out.println((char)data);
            data = reader.read();
        }

        reader.close();
    }catch(FileNotFoundException e) {
        e.printStackTrace();
    }
}
