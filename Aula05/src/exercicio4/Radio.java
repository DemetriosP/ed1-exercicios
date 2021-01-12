package exercicio4;

public class Radio extends Eletrodomesticos{
	
	private int volume = 0;
	
	private double frequencia = 0;

	@Override
	public void ligar() {
		this.frequencia = 99.9;
		this.volume = 40;
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
				System.out.println("O volume do r�dio foi aumentado para " + volume);
				break;
			} else {
				System.out.println("O valor informado para o volume � inv�lido!");
			}
		}
	}
	
	public void mudarFrequencia(double frequencia) {
		this.frequencia = frequencia;
	}

	public void getVolume() {
		System.out.println("A altura do volume do r�dio � " + volume);
	}

	public void getFrequencia() {
		System.out.println("A r�dio est� na frequ�ncia " + frequencia);
	}

}
