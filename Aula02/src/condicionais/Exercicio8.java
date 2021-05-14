package condicionais;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int anoNascimento, anoAtual;
		
		System.out.println("Informe o ano do seu nascimento: ");
		anoNascimento = leitura.nextInt();
		
		System.out.println("Informe o ano atual: ");
		anoAtual = leitura.nextInt();
		
		
		for(int ano = anoNascimento; ano <= anoAtual; ano++) {
			
			if(ano % 4 == 0) {
				
				if(ano % 100 == 0) {
					
					if(ano % 400 == 0) {
						
						System.out.println(ano);
					}
				}else {
					System.out.println(ano);
				}
			}
			
		}
		
	}
}
