package exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		double preco, valorDesconto, valorParcela, valorParcelado;
		String opcao;
		
		System.out.print("Informe o valor do produto: ");
		preco = leitura.nextDouble();
		
		System.out.println("Escolha uma opção:");
		System.out.println("A) A vista: 10% de desconto");
		System.out.println("B) 2 vezes: juros de 5%");
		System.out.println("C) 3 vezes: juros de 10%");
		opcao = leitura.next().toUpperCase();
		
		switch(opcao) {
			case "A":
				valorDesconto = preco - (preco * 0.10);
				System.out.println("O valor a vista é de R$ " + valorDesconto);
				break;
			case "B":
				valorParcelado = preco + (preco * 0.05);
				valorParcela = valorParcelado / 2;
				System.out.println("O valor parcelado é de R$ " + valorParcelado);
				System.out.println("O valor da parcela é de R$ " + valorParcela);
				break;
			case "C":
				valorParcelado = preco + (preco * 0.1);
				valorParcela = valorParcelado / 3;
				System.out.println("O valor parcelado é de R$ " + valorParcelado);
				System.out.println("O valor da parcela é de R$ " + valorParcela);
				break;
			default:
				System.out.println("A opção escolhida é inválida");
				break;
		}
	}
	

}
