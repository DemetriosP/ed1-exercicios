package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class PedidoDoCliente{

	private List<Double> valorPedido = new ArrayList<>();
	
	private List<String> nomePedido = new ArrayList<>();
	
	private double total = 0;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total += total;
	}

	public void exibeConta() {
		System.out.println("\n\t   CONTA\n");
		System.out.println("Descição\tPreço");
		for(int posicao = 0; posicao < valorPedido.size(); posicao++) {
			System.out.print(nomePedido.get(posicao));
			System.out.println("\t" + valorPedido.get(posicao));
		}
		System.out.println("\n\t\tTotal");
		System.out.println("\t\t" + getTotal());
	}

	public void registraPedido(String nomePedido, double valorPedido) {
		this.valorPedido.add(valorPedido);
		this.nomePedido.add(nomePedido);
		setTotal(valorPedido);
	}
	
}