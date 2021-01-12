package exerciciosAula07;

public class Aluno implements Comparable<Aluno>{
	
	private int prontuario;
	
	private String nome;
	
	private double mediaFinal;
	
	public Aluno(int prontuario, String nome, double mediaFinal) {
		this.prontuario = prontuario;
		this.nome = nome;
		this.mediaFinal = mediaFinal;
	}

	public double getMediaFinal() {
		return mediaFinal;
	}

	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getProntuario() {
		return prontuario;
	}

	public void setProntuario(int prontuario) {
		this.prontuario = prontuario;
	}

	@Override
	public int compareTo(Aluno outra) {

		if(this.mediaFinal < outra.getMediaFinal()) return -1;
		if(this.mediaFinal > outra.getMediaFinal()) return 1;
		
		int r = this.nome.compareTo(outra.getNome());
		return r;
		
	}
	
}
