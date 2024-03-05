package Exercises.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Math.random() * (100 - 0) + 0;
        double numberCeil = Math.ceil(number);

        double palpite = 0;
        int tentativas = 0;

        System.out.println(numberCeil);

        while (palpite != numberCeil) {
            System.out.println("Digite um numero: ");
            palpite = scanner.nextDouble();
            if(palpite == numberCeil) {
                System.out.println("Você acertou o número! \n");
            } else {
                System.out.println("Você errou o número \n");
                tentativas++;
            }
        }

        System.out.printf("O número correto é: %.0f \n", numberCeil);
        System.out.printf("Número de tentativas: %d \n", tentativas);

        scanner.close();
    }
}
