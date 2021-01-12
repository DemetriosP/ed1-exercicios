package conjuntos;

public class Animal implements Comparable<Animal>{
	
	private String nome;
	
	private double peso;
	
	public Animal(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public int compareTo(Animal outra) {
		if(this.peso < outra.getPeso()) return -1;
		if(this.peso > outra.getPeso()) return 1;
		return 0;
	}
	
}
