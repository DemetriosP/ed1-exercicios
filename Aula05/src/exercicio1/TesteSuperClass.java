package exercicio1;

import java.util.Scanner;

public class TesteSuperClass {
	
	public static void main(String args[]) {
		
		Scanner leitura = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.print("Informe o nome da pessoa: ");
		nome = leitura.next();
		System.out.print("Infome a idade da pessoa: ");
		idade = Integer.parseInt(leitura.next());
		
		leitura.close();
		
		Pessoa p = new Pessoa(nome, idade);
		
		System.out.println(p.nome);
		System.out.println(p.getIdade());
		
	}

}
