package Exercises.ex1.lista1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        /*************************************************************************
         *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
         *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
         *
         *************************************************************************/

        Scanner scanner = new Scanner(System.in);
        double est_medio, qtd_min, qtd_max;

        System.out.println("Digite a quantidade mínima: ");
        qtd_min = scanner.nextDouble();

        System.out.println("Digite a quantidade máxima: ");
        qtd_max = scanner.nextDouble();

        est_medio = (qtd_min + qtd_max) / 2;

        System.out.printf("Estoque Médio: %.1f", est_medio);

        scanner.close();
    }
}
