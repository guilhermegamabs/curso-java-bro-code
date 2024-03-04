package MethodOverriding;

public class Main {
    public static void main(String[] args) {
        Animal anima = new Animal();
        Dog dog = new Dog();

        dog.speak();
        anima.speak();
    }
}
