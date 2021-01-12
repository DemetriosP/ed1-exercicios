package exercicios;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		String produto;
		double valorProduto, valorVista, valorPrazo, valorParcela;
		
		System.out.println("Digite o nome do produto: ");
		produto = leitura.nextLine();
		
		System.out.println("Digite o valor do produto: ");
		valorProduto = leitura.nextDouble();
		
		valorVista = valorProduto - (valorProduto * (10.0 / 100.0));
		valorPrazo = valorProduto + (valorProduto * (5.0 / 100.0));
		valorParcela = valorPrazo / 3;
		
		System.out.println();
		System.out.println("Produto: " + produto);
		System.out.println("À vista: R$ " + valorVista);
		System.out.println("À prazo: R$ " + valorPrazo);
		System.out.println("3 parcelas de R$ " + valorParcela);
	}

}
