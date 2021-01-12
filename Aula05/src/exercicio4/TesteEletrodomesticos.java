package exercicio4;

public class TesteEletrodomesticos {
	
	public static void main(String args[]) {
		
		Televisao telev = new Televisao();
		Radio rad = new Radio();
		
		rad.ligar();
		rad.getVolume();
		rad.getFrequencia();
		rad.verificarEstado();
		rad.aumentarVolume(20);
		rad.getVolume();
		rad.mudarFrequencia(89.9);
		rad.getFrequencia();
		rad.desligar();
		rad.verificarEstado();
		
		telev.ligar();
		telev.getVolume();
		telev.getCanal();
		telev.verificarEstado();
		telev.aumentarVolume(20);
		telev.getVolume();
		telev.mudarCanal(5);
		telev.getCanal();
		telev.desligar();
		telev.verificarEstado();
	}

}
