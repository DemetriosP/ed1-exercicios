package exercicio2;

public class Moto extends Veiculo{

	private String temBau;
	
	public Moto(String modelo, String fabricante, String cor, String temBau, int ano, int nRodas, int nMarchas) {
		super(modelo, fabricante, cor, ano, nRodas, nMarchas);
		this.temBau = temBau;
	}

	public void getTemBau() {
		System.out.println("Tem báu: " + temBau);
	}
}
