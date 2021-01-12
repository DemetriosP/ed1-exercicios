package exercicio1;

public class Aluno extends Pessoa{
	
	private int matricula;
	private String curso;
	private int anoCursando;
	
	public Aluno(String nome, int idade, int matricula, String curso, int anoCursando) {
		super(nome, idade);
		this.matricula = matricula;
		this.curso = curso;
		this.anoCursando = anoCursando;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

	public int getAnoCursando() {
		return anoCursando;
	}
	
}
