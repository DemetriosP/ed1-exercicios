package condicionais;

import java.util.Scanner;

public class Exercicio7_1 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		String opcao;
		
		do {
			
			System.out.println("Menu\nA\nB\nC\nS\nDigite uma letra");
			opcao = leitura.nextLine();
			
		}while(!opcao.equals("S"));
		
	}

}

