package exercicios;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		int contador = 19;
		
		do {
			
			if(contador % 2 != 0) {
				System.out.println(contador);
			}
		
			contador--;
			
		}while(contador != 8);
	}

}
