package exercicio6;

public class TesteContaCorrente {
	
	public static void main(String args[]) {
		
		ContaCorrente contaCor = new ContaCorrente(168, 482579, "Demetrios");
		ContaCorrente contaCor2 = new ContaCorrente(152, 269812, "Jarvis");
		
		contaCor.saca(20);
		contaCor.transfAgencia(0);
		contaCor.getSaldo();
		contaCor.getAgencia();
		contaCor.getNumero();
		contaCor.getTitular();
		contaCor.deposita(500);
		contaCor.getSaldo();
		contaCor.saca(30);
		contaCor.transfere(100, contaCor2);
		contaCor.getSaldo();
		
		contaCor2.getSaldo();
		contaCor2.saca(20);
		contaCor2.getSaldo();
		contaCor2.getAgencia();
		contaCor2.getNumero();
		contaCor2.getTitular();
		contaCor2.transfAgencia(100);
	}
}
