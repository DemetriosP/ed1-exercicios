package exercicio1;

public class Professor extends Pessoa{
	
	private String formacao;
	
	public Professor(String nome, int idade, String formacao) {
		super(nome, idade);
		this.formacao = formacao;
	}

	public String getFormacao() {
		return formacao;
	}
}
