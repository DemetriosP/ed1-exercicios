package exercicio1protect;

import exercicio1.Aluno;

public class TesteProtected {

	public TesteProtected() {
		Aluno alu = new Aluno("Demetrios", 25, 3007685, "An�lise e Desenvolvimento do Software", 2);
		System.out.println("Informa��es do Aluno");
		System.out.println("Nome: " + alu.nome);//nome n�o est� dispon�vel para a classe TesteProtected  
												//pois ela n�o pertence ao mesmo pacote que Pessoa
		System.out.println("Idade: " + alu.getIdade());
		System.out.println("Matr�cula: " + alu.getMatricula());
		System.out.println("Curso: " + alu.getCurso());
		System.out.println("Ano que est� cursando: " + alu.getAnoCursando());
	}
	
	
}
