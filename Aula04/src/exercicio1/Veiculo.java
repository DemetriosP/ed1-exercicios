package exercicio1;

public class Veiculo {

	private String modelo;
	
	private String fabricante;
	
	private int ano;
	
	private int nPortas;
	
	private int nRodas;
	
	private String cor;
	
	private int nMarchas;
	
	public void getModelo() {
		System.out.println("Modelo: " + modelo);
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void getFabricante() {
		System.out.println("Fabricante: " + fabricante);
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public void getAno() {
		System.out.println("Ano: " + ano);
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void getnPortas() {
		System.out.println("Número de portas: " + nPortas);
	}
	public void setnPortas(int nPortas) {
		this.nPortas = nPortas;
	}
	public void getnRodas() {
		System.out.println("Número de rodas: " + nRodas);
	}
	public void setnRodas(int nRodas) {
		this.nRodas = nRodas;
	}
	public void getCor() {
		System.out.println("Cor: " + cor);
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void getnMarchas() {
		System.out.println("Número de marchas: " + nMarchas);
	}
	public void setnMarchas(int mMarchas) {
		this.nMarchas = mMarchas;
	}
	
}
