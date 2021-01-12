package conjuntos;

import java.util.ArrayList;
import java.util.TreeSet;

public class TesteAnimal {
	
	public static void main(String args[]) {
		
		//criando 3 objetos do tipo animal
		Animal a1 = new Animal("Porco", 75);
		Animal a2 = new Animal("Cavalo", 820);
		Animal a3 = new Animal("Vaca", 720);
		
		//cria a TreeSet de animais
		TreeSet<Animal> arvoreAnimais = new TreeSet<>();
		
		//verifica se a TreeSet est� vazia
		if ( arvoreAnimais.isEmpty() ) {
			System.out.println("O TreeSet est� vazio");
		} else {
			System.out.println("H� um ou mais itens no TreeSet");
		}
		
		//lista os itens da TreeSet
		if(arvoreAnimais.size() != 0) {
			for(Animal a : arvoreAnimais) {
				System.out.println("Lista dos itens da TreeSet �rvore de Animais");
				System.out.println("Nome: " + a.getNome());
				System.out.println("Peso: " + a.getPeso());
				System.out.println("--------------------");
			}
		}else System.out.println("Imposs�vel listar os itens da TreeSet pois ela est� vazia.");
		
		//adiciona um animal na TreeSet
		arvoreAnimais.add(a1);
		
		//verifica se a TreeSet est� vazia
		if ( arvoreAnimais.isEmpty() ) {
			System.out.println("O TreeSet est� vazio");
		} else {
			System.out.println("H� um ou mais itens no TreeSet");
		}
		
		//exibe a quantidade de itens presentes na TreeSet
		System.out.println( "Total de itens na TreeSet �rvore de Animais: " + arvoreAnimais.size());
		
		//lista os itens da TreeSet
		if(arvoreAnimais.size() != 0) {
			for(Animal a : arvoreAnimais) {
				System.out.println("Lista dos itens da TreeSet �rvore de Animais");
				System.out.println("Nome: " + a.getNome());
				System.out.println("Peso: " + a.getPeso());
				System.out.println("--------------------");
			}
		}else System.out.println("Imposs�vel listar os itens da TreeSet pois ela est� vazia.");
		
		//cria uma ArrayList de animais
		ArrayList<Animal> listaAnimais = new ArrayList<>();
		
		//adiciona na ArrayList dois animais diferentes do contido na TreeSet
		listaAnimais.add(a2);
		listaAnimais.add(a3);
		
		//verefica se os itens da ArrayList est�o presentes na TreeSet
		for(Animal a : listaAnimais) {
			if (arvoreAnimais.contains(a)) {
				System.out.println("O item abaixo est� presente");
				System.out.println(a.getNome());
				System.out.println(a.getPeso());
			}else {
				System.out.println("O item abaixo n�o est� presente");
				System.out.println(a.getNome());
				System.out.println(a.getPeso());
			}
		}
		
		//adiciona todos os itens da ArrayLista na TreeSet
		arvoreAnimais.addAll(listaAnimais);
		
		//lista os itens da TreeSet
		if(arvoreAnimais.size() != 0) {
			for(Animal a : arvoreAnimais) {
				System.out.println("Lista dos itens da TreeSet �rvore de Animais");
				System.out.println("Nome: " + a.getNome());
				System.out.println("Peso: " + a.getPeso());
				System.out.println("--------------------");
			}
		}else System.out.println("Imposs�vel listar os itens da TreeSet pois ela est� vazia.");
		
		//verefica se os itens da ArrayList est�o presentes na TreeSet
		for(Animal a : listaAnimais) {
			if (arvoreAnimais.contains(a)) {
				System.out.println("O item abaixo est� presente");
				System.out.println(a.getNome());
				System.out.println(a.getPeso());
			}else {
				System.out.println("O item abaixo n�o est� presente");
				System.out.println(a.getNome());
				System.out.println(a.getPeso());
			}
		}
		
		//exibe a quantidade de itens presentes na TreeSet
		System.out.println( "Total de itens na TreeSet �rvore de Animais: " + arvoreAnimais.size());
		
		//remove da TreeSet o primeiro animal inserido
		arvoreAnimais.remove(a1);
		
		//lista os itens da TreeSet
		if(arvoreAnimais.size() != 0) {
			for(Animal a : arvoreAnimais) {
				System.out.println("Lista dos itens da TreeSet �rvore de Animais");
				System.out.println("Nome: " + a.getNome());
				System.out.println("Peso: " + a.getPeso());
				System.out.println("--------------------");
			}
		}else System.out.println("Imposs�vel listar os itens da TreeSet pois ela est� vazia.");
		
		//remove da TreeSet todos os itens presents na ArrayList
		arvoreAnimais.removeAll(listaAnimais);
		
		//limpa a TreeSet
		arvoreAnimais.clear();
		
		
	}
	
}
