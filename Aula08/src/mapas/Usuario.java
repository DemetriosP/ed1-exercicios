package mapas;

public class Usuario {
	
	private int ra;
	
	private String nome;
	
	private String endereco;
	
	private String email;
	
	public Usuario(int ra, String nome, String endereco, String email) {
		this.setRa(ra);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setEmail(email);
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
