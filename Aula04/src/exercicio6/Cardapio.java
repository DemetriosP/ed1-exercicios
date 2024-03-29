package exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Cardapio{
	
	private List<ItemDoCardapio> itens = new ArrayList<>();
	
	public void exibirCardapio() {
		System.out.println("\t   CARD�PIO\n");
		System.out.println("C�digo\tDescri��o\tPre�o\t");
		for(int posicao = 0;posicao < itens.size(); posicao++) {
			System.out.print("   " + (posicao + 1) + "\t" + this.itens.get(posicao).getNome());
			System.out.println("\t" + this.itens.get(posicao).getValor());
		}
	}

	public String getItensNome(int item) {
		return this.itens.get(item).getNome();
	}
	
	public double getItensValor(int item) {
		return this.itens.get(item).getValor();
	}
	
	public void setItens(ItemDoCardapio item) {
		if(itens.size() < 5) this.itens.add(item); 
		else System.out.println("Valor maximo de itens alcan�ado!");
	}
	
	
}