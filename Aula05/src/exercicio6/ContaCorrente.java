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
        System.out.println("Você depositou R$ " + valor);
    }

    public void saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Você sacou R$ " + valor + " da sua conta");
        } else {
            System.out.println("Valor indisponível!");
        }
    }

    public void transfere(double valor, ContaCorrente destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("Você depositou R$ " + valor + " na conta de " + destino.getTitular());
        } else {
        	System.out.println("Valor indisponível!");
        }
    }

    public void getSaldo() {
        System.out.println("Saldo da conta é " + saldo);
    }

    public void getNumero() {
        System.out.println("Número da conta é " + numero);
    }

    public void getAgencia() {
        System.out.println("Agência da conta é " + agencia);
    }

    public void transfAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
        }else {
        	System.out.println("Não é possível valores negativos");
        }
    }
        
    public String getTitular() {
        return titular;
    }

}
