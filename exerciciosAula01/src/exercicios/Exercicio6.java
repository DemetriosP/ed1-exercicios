package exercicios;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		double raio, altura, volume;
		
		System.out.println("Informe o raio do cilindro: ");
		raio = leitura.nextDouble();
		
		System.out.println("Informe a altura do cilindro: ");
		altura = leitura.nextDouble();
		
		
		volume = 3.14 * (raio * raio) * altura;
		
		System.out.println("O volume do cilindro informado é " + volume);
	}

}
