package exercicio2;

public class Bicicleta extends Veiculo{

	private String temCesta;
	
	public Bicicleta(String modelo, String fabricante, String cor, String temCesta, int ano, int nRodas, int nMarchas) {
		super(modelo, fabricante, cor, ano, nRodas, nMarchas);
		this.temCesta = temCesta;
	}

	public void getTemCesta() {
		System.out.println("Tem cesta :" + temCesta);
	}

}
