package exercicio2;

public class Carro extends Veiculo{

	private int nPortas;

	public void getnPortas() {
		System.out.println("Número de Portas: " + nPortas);
	}
	
	public Carro(String modelo, String fabricante, String cor, int ano, int nRodas, int nMarchas, int nPortas) {
		super(modelo, fabricante, cor, ano, nRodas, nMarchas);
		this.nPortas = nPortas;
	}
	
}
