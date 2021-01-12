package exercicio1protect;

import exercicio1.Aluno;

public class TesteProtected {

	public TesteProtected() {
		Aluno alu = new Aluno("Demetrios", 25, 3007685, "Análise e Desenvolvimento do Software", 2);
		System.out.println("Informações do Aluno");
		System.out.println("Nome: " + alu.nome);//nome não está disponível para a classe TesteProtected  
												//pois ela não pertence ao mesmo pacote que Pessoa
		System.out.println("Idade: " + alu.getIdade());
		System.out.println("Matrícula: " + alu.getMatricula());
		System.out.println("Curso: " + alu.getCurso());
		System.out.println("Ano que está cursando: " + alu.getAnoCursando());
	}
	
	
}
