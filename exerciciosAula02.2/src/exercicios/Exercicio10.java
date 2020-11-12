package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int codigo, quantidade;
		double valorPagar = 0, troco, valorPagoCli;
	
		System.out.println("****************************************************");
		System.out.println("Cardápio");
		System.out.println("****************************************************");
		System.out.println("Código \tProduto         \tValor unitário em R$");
		System.out.println("100    \tCachorro-quente \t6,00");
		System.out.println("101    \tBauru simples   \t4,00");
		System.out.println("102    \tBauru com ovo   \t4,50");
		System.out.println("103    \tHumburguer      \t7,00");
		System.out.println("104    \tCheeseburger    \t7,50");
		System.out.println("105    \tRefrigerante    \t3,50");
		System.out.println("****************************************************");
		
		System.out.print("Informe o código do produto: ");
		codigo = leitura.nextInt();
		System.out.print("Informe a quantidade do produto: ");
		quantidade = leitura.nextInt();
		
		switch(codigo) {
			case 100:
				valorPagar = quantidade * 6;
				System.out.println("O valor a ser pago é de R$ " + valorPagar);
				break;
			case 101:
				valorPagar = quantidade * 4;
				System.out.println("O valor a ser pago é de R$ " + valorPagar);
				break;
			case 102:
				valorPagar = quantidade * 4.5;
				System.out.println("O valor a ser pago é de R$ " + valorPagar);
				break;
			case 103:
				valorPagar = quantidade * 7;
				System.out.println("O valor a ser pago é de R$ " + valorPagar);
				break;
			case 104:
				valorPagar = quantidade * 7.5;
				System.out.println("O valor a ser pago é de R$ " + valorPagar);
				break;
			case 105:
				valorPagar = quantidade * 3.5;
				System.out.println("O valor a ser pago é de R$ " + valorPagar);
				break;
			default:
				System.out.println("O código do produto informado é inválido");
				break;
		} 
		
		System.out.print("Informe o pago pelo cliente: ");
		valorPagoCli = leitura.nextDouble();
		
		troco = valorPagoCli - valorPagar;
		
		if(troco > 0) {
			System.out.println("O troco do cliente é de R$ " + troco);
		}else {
			System.out.println("O cliente não tem troco");
		}
		
	}
}