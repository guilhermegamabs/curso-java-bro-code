package Exercises.ex1.lista1;

import java.util.Scanner;

/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cot_dolar, valor_dolar, valor_real;

        System.out.println("Digite a cotação atual do dólar: \n");
        cot_dolar = scanner.nextDouble();

        System.out.println("Digite um valor em dólar: \n");
        valor_dolar = scanner.nextDouble();

        valor_real = valor_dolar * cot_dolar;

        System.out.printf("O valor em reais é: %.2f", valor_real);
        
        scanner.close();
    }
}
