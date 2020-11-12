package exercicios;
import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int anos, caixasPorDia;
		double valorCaixaCigarro, valorGasto;
		
		System.out.println("Informe a quatidade de caixas de cigarro que você consome por dia: ");
		caixasPorDia = leitura.nextInt();
		
		System.out.println("Informe o valor pago por cada caixa de cigarro: ");
		valorCaixaCigarro = leitura.nextDouble();
		
		System.out.println("Informe a quatidade de anos: ");
		anos = leitura.nextInt();
		
		valorGasto = (((caixasPorDia * 30) * 12) * anos) * valorCaixaCigarro;
		
		System.out.println("Você terá gasto em " + anos + " anos R$ " + valorGasto + " em cigarro");
		
	}

}
