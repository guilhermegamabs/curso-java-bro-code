package Exercises.ex1.lista1;

import java.util.Scanner;

/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida

 *************************************************************************/

public class ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double preco_unitario, qtd_vendida, valor_comissao;
        double porcentagemComissao = 0.05f;
        System.out.println("Preço Unitário da Peça: ");
        preco_unitario = scanner.nextDouble();

        System.out.println("Digite a quantidade vendida: ");
        qtd_vendida = scanner.nextDouble();

        valor_comissao = (preco_unitario * qtd_vendida) * porcentagemComissao;
        System.out.printf("O valor da comissão é: %.2f", valor_comissao);

        scanner.close();


    }
}
