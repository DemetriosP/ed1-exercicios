package exercicio5;

public class Pessoa {
	
	private String cpf;
	
	private String nome;
	
	private Data dataNascimento;
	
	public static int totalDePessoas = 0;
	
	public Pessoa() {
		totalDePessoas++;
	}

	public void getCpf() {
		System.out.println("CPF: " + cpf);
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void getNome() {
		System.out.println("Nome: " + nome);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void getDataNascimento() {
		
		String data = "";
		
		data += this.dataNascimento.getDia();
		data += "-" + this.dataNascimento.getMes();
		data += "-" + this.dataNascimento.getAno();
		
		System.out.println("Data: " + data);
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
