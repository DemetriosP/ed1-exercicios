package exercicio6;

public class ContaCorrente {
	
	private double saldo;
    private int agencia;
    private int numero;
    private String titular;
  
    public ContaCorrente(int agencia, int numero, String titular) {        
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Voc� depositou R$ " + valor);
    }

    public void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Voc� sacou R$ " + valor + " da sua conta");
        } else {
            System.out.println("Valor indispon�vel!");
        }
    }

    public void transfere(double valor, ContaCorrente destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("Voc� depositou R$ " + valor + " na conta de " + destino.getTitular());
        } else {
        	System.out.println("Valor indispon�vel!");
        }
    }

    public void getSaldo() {
        System.out.println("Saldo da conta � " + saldo);
    }

    public void getNumero() {
        System.out.println("N�mero da conta � " + numero);
    }

    public void getAgencia() {
        System.out.println("Ag�ncia da conta � " + agencia);
    }

    public void transfAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
        }else {
        	System.out.println("N�o � poss�vel valores negativos");
        }
    }
        
    public String getTitular() {
        return titular;
    }

}
