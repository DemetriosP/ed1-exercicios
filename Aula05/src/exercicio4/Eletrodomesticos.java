package exercicio4;

public abstract class Eletrodomesticos {
	
	private boolean ligado = false;
	
	@SuppressWarnings("unused")
	private boolean desligado = true;
	
	public abstract void ligar();
	
	public abstract void desligar();
	
	public void verificarEstado() {
		if (this.ligado) System.out.println("O aparelho est� ligado"); else System.out.println("O aparelho est� desligado");
	}

	public void setLigado() {
		this.ligado = true;
		this.desligado = false;
	}
	
	public void setDesligado() {
		this.desligado = true;
		this.ligado = false;
	}

}