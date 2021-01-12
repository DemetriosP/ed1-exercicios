package exercicio1;

import java.util.Scanner;

public class TesteSubClass {
	
	public static void main(String args[]) {
		
		Scanner leitura = new Scanner(System.in);
		String nome, curso, formacao, funcao;
		int idade, matricula, anoCursando;
		
		System.out.println("Prencha as informa��es do Aluno");
		System.out.print("Informe o nome: ");
		nome = leitura.next();
		System.out.print("Infome a idade: ");
		idade = Integer.parseInt(leitura.next());
		System.out.print("Informe a matr�cula: ");
		matricula = Integer.parseInt(leitura.next());
		System.out.print("Informa o curso: ");
		curso = leitura.next();
		System.out.print("Informe o ano do curso cursado: ");
		anoCursando = Integer.parseInt(leitura.next());
		
		Aluno alu = new Aluno(nome, idade, matricula, curso, anoCursando);
		
		System.out.println("Prencha as informa��es do Professor");
		System.out.print("Informe o nome: ");
		nome = leitura.next();
		System.out.print("Infome a idade: ");
		idade = Integer.parseInt(leitura.next());
		System.out.print("Informe a forma��o: ");
		formacao = leitura.next();
		
		Professor pro = new Professor(nome, idade, formacao);
		
		System.out.println("Prencha as informa��es do T�cnico Administativo");
		System.out.print("Informe o nome: ");
		nome = leitura.next();
		System.out.print("Infome a idade: ");
		idade = Integer.parseInt(leitura.next());
		System.out.print("Informe a fun��o: ");
		funcao = leitura.next();
		
		leitura.close();
		
		TecnicoAdm tec = new TecnicoAdm(nome, idade, funcao);
		
		System.out.println("Informa��es do Aluno");
		System.out.println("Nome: " + alu.nome);
		System.out.println("Idade: " + alu.getIdade());
		System.out.println("Matr�cula: " + alu.getMatricula());
		System.out.println("Curso: " + alu.getCurso());
		System.out.println("Ano que est� cursando: " + alu.getAnoCursando());
		
		System.out.println("Informa��es do Professor");
		System.out.println("Nome: " + pro.nome);
		System.out.println("Idade: " + pro.getIdade());
		System.out.println("Forma��o: " + pro.getFormacao());
		
		System.out.println("Informa��es do T�cnico Administrativo");
		System.out.println("Nome: " + tec.nome);
		System.out.println("Idade: " + tec.getIdade());
		System.out.println("Fun��o: " + tec.getFuncao());
	}

}
