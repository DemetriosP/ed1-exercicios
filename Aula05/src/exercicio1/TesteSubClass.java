package exercicio1;

import java.util.Scanner;

public class TesteSubClass {
	
	public static void main(String args[]) {
		
		Scanner leitura = new Scanner(System.in);
		String nome, curso, formacao, funcao;
		int idade, matricula, anoCursando;
		
		System.out.println("Prencha as informações do Aluno");
		System.out.print("Informe o nome: ");
		nome = leitura.next();
		System.out.print("Infome a idade: ");
		idade = Integer.parseInt(leitura.next());
		System.out.print("Informe a matrícula: ");
		matricula = Integer.parseInt(leitura.next());
		System.out.print("Informa o curso: ");
		curso = leitura.next();
		System.out.print("Informe o ano do curso cursado: ");
		anoCursando = Integer.parseInt(leitura.next());
		
		Aluno alu = new Aluno(nome, idade, matricula, curso, anoCursando);
		
		System.out.println("Prencha as informações do Professor");
		System.out.print("Informe o nome: ");
		nome = leitura.next();
		System.out.print("Infome a idade: ");
		idade = Integer.parseInt(leitura.next());
		System.out.print("Informe a formação: ");
		formacao = leitura.next();
		
		Professor pro = new Professor(nome, idade, formacao);
		
		System.out.println("Prencha as informações do Técnico Administativo");
		System.out.print("Informe o nome: ");
		nome = leitura.next();
		System.out.print("Infome a idade: ");
		idade = Integer.parseInt(leitura.next());
		System.out.print("Informe a função: ");
		funcao = leitura.next();
		
		leitura.close();
		
		TecnicoAdm tec = new TecnicoAdm(nome, idade, funcao);
		
		System.out.println("Informações do Aluno");
		System.out.println("Nome: " + alu.nome);
		System.out.println("Idade: " + alu.getIdade());
		System.out.println("Matrícula: " + alu.getMatricula());
		System.out.println("Curso: " + alu.getCurso());
		System.out.println("Ano que está cursando: " + alu.getAnoCursando());
		
		System.out.println("Informações do Professor");
		System.out.println("Nome: " + pro.nome);
		System.out.println("Idade: " + pro.getIdade());
		System.out.println("Formação: " + pro.getFormacao());
		
		System.out.println("Informações do Técnico Administrativo");
		System.out.println("Nome: " + tec.nome);
		System.out.println("Idade: " + tec.getIdade());
		System.out.println("Função: " + tec.getFuncao());
	}

}
