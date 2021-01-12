package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int numero1, numero2, conta;
		char operador;
		
		System.out.print("Informe o primeiro número inteiro: ");
		numero1 = leitura.nextInt();
		
		System.out.print("Informe o segundo número inteiro: ");
		numero2 = leitura.nextInt();
		
		System.out.println("Informe o operador desejado");
		System.out.print("*) Multiplicar\n/) Dividir\n+) Somar\n-) Subtrair");
		operador = leitura.next().charAt(0);
		
		switch(operador) {
			case '*':
				conta = numero1 * numero2;
				System.out.println(conta);
				break;
			case '/':
				conta = numero1 / numero2;
				System.out.println(conta);
				break;
			case '+':
				conta = numero1 + numero2;
				System.out.println(conta);
				break;
			case '-':
				conta = numero1 - numero2;
				System.out.println(conta);
				break;
			default:
				System.out.println("O caracter informado é inválido");
				break;
		}
	}
}