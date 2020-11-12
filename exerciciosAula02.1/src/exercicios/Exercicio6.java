package exercicios;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Informe o primeiro número: ");
		num1 = leitura.nextInt();
		
		System.out.println("Informe o segundo número: ");
		num2 = leitura.nextInt();
		
		if(num1 > num2) {
			
			do {
				
				System.out.println(num1);
				num1--;
				
			}while(num1 >= num2);
			
			
		}else {
			
			do {
				
				System.out.println(num1);
				num1++;
				
			}while(num1 <= num2);
			
		}
		
	}

}
