package SuperKeyWord;

public class Hero extends  Person{
    String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    void display() {
        System.out.printf("\nName: %s\n Age: %d\n Power: %s", name, age, power);
    }

}
