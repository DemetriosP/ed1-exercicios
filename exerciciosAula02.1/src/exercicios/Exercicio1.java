package exercicios;

public class Exercicio1 {
	
	public static void main(String[] args) {
	
		int contador = 0;
		
		while (contador <= 20){
			
			if (contador % 2 == 0) {
				System.out.println(contador);
			}
			
			contador += 1;
		}
	}
}
