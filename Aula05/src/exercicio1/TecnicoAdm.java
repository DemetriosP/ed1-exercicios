package exercicio1;

public class TecnicoAdm extends Pessoa{
	
	private String funcao;
	
	public TecnicoAdm(String nome, int idade, String funcao) {
		super(nome, idade);
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

}
