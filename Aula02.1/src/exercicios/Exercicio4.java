package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Informe o primeiro número: ");
		num1 = leitura.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = leitura.nextInt();
		
		if(num1 > num2) {
			for(int i = num1; num1 >= num2; num1--) {
				System.out.println(num1);
			}
		}else {
			for(int i = num1; num1 <= num2; num1++) {
				System.out.println(num1);
			}
		}
		
	}

}
