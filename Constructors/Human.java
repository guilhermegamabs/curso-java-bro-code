package Constructors;

public class Human {
    String name;
    int age;
    double weight;
    Human(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    }

    void presentation() {
        System.out.printf("Hello World! My name is %s, I have %d years old and I'm %.2f KGs.", name, age, weight);
    }
}
