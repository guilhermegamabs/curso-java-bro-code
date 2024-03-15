package ex1;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 19);
        Client c1 = new Client("Guilherme", 19, 2000);
        System.out.println(c1.getName());
    }
}
