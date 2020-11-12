package exercicios;

import java.util.Scanner;

public class Exercicio7_2 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		String opcao;
		
		do {
			
			System.out.println("Menu\nPrimeira\nSegunda\nTerceira\nSair\nDigite uma opção");
			opcao = leitura.nextLine().toUpperCase();
			
		}while(!opcao.equals("SAIR"));
		
	}

}

