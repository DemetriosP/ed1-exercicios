package exercicio2;

public class Veiculo {

	private String modelo;
	
	private String fabricante;
	
	private int ano;
		
	private int nRodas;
	
	private String cor;
	
	private int nMarchas;
	
	public Veiculo (String modelo, String fabricante, String cor, int ano, int nRodas, int nMarchas) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.cor = cor;
		this.ano = ano;
		this.nRodas = nRodas;
		this.nMarchas = nMarchas;
	}
	
	public void getModelo() {
		System.out.println("Modelo: " + modelo);
	}
	
	public void getFabricante() {
		System.out.println("Fabricante: " + fabricante);
	}
	
	public void getAno() {
		System.out.println("Ano: " + ano);
	}
	
	public void getnRodas() {
		System.out.println("Número de rodas: " + nRodas);
	}
	
	public void getCor() {
		System.out.println("Cor: " + cor);
	}
	
	public void getnMarchas() {
		System.out.println("Número de marchas: " + nMarchas);
	}
	
}
