package PolymorphismDinamic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - (dog) \n2 - (cat)");
        int choice = scanner.nextInt();

        if(choice == 1) {
            dog.speak();
        } else if(choice == 2) {
            cat.speak();
        } else {
            animal.speak();
        }

        scanner.close();
    }
}
