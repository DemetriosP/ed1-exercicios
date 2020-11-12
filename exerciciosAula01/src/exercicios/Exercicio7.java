package exercicios;
import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		double perimetro, area, altura, base;
		
		System.out.println("Informe a altura do terreno retangular: ");
		altura = leitura.nextDouble();
		
		System.out.println("Informe a base do terreno retangular: ");
		base = leitura.nextDouble();
		
		perimetro = base * 2 + altura * 2;
		area = base * altura;
		
		System.out.println("O perimento do terreno retangular é de " + perimetro + " metros lineares");
		System.out.println("A área do terreno retangular é de " + area + " metros quadrados");
		
	}

}
