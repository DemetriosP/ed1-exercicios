package exercicios;
import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		double p1, t1, le, p2, t2, se, bi1, bi2, mediaFinal;
		
		System.out.println("Informe o valor da P1: ");
		p1 = leitura.nextDouble() * 0.6;
		
		System.out.println("Informe o valor da T1: ");
		t1 = leitura.nextDouble() * 0.3;
		
		System.out.println("Informe o valor da LE: ");
		le = leitura.nextDouble() * 0.1;
		
		System.out.println("Informe o valor da P2: ");
		p2 = leitura.nextDouble() * 0.5;
		
		System.out.println("Informe o valor da T2: ");
		t2 = leitura.nextDouble() * 0.35;
		
		System.out.println("Informe o valor da SE: ");
		se = leitura.nextDouble() * 0.15;
		
		bi1 = p1 + t1 + le;
		bi2 = p2 + t2 + se;
		mediaFinal = (bi1 + bi2) / 2;
		
		System.out.println("A media do primeiro bimestre é " + bi1);
		System.out.println("A media do segundo bimestre é " + bi2);
		System.out.println("A media final é " + mediaFinal);
		
	}

}