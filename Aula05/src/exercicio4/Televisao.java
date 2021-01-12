package exercicio4;

public class Televisao extends Eletrodomesticos{
	
	private int volume = 0;
	
	private int canal = 0;

	@Override
	public void ligar() {
		this.canal = 1;
		this.volume = 20;
		setLigado();
	}

	@Override
	public void desligar() {
		setDesligado();
	}
	
	public void aumentarVolume(int volume) {
		while(true) {
			if(volume >= 0 || volume <= 100) {
				this.volume = volume;
				System.out.println("O volume da televis�o foi aumentado para " + volume);
				break;
			} else {
				System.out.println("O valor informado para o volume � inv�lido!");
			}
		}
	}
	
	public void mudarCanal(int canal) {
		this.canal = canal;
	}
	
	public void getVolume() {
		System.out.println("A altura do volume da televis�o � " + volume);
	}

	public void getCanal() {
		System.out.println("A televis�o est� no canal " + canal);
	}
}
