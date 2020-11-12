package exercicio3;

public class OperacoesMatematicas {

	public void somar(int numeros[]) {
		int soma = 0;
		for(int posicao = 0; posicao < numeros.length; posicao++) {	
			soma += numeros[posicao];
		}
		System.out.println("A soma dos numeros contidos no vetor � " + soma);
	}
	
	public void subtrair(int numeros[]) {
		int subtrai = 0;
		for(int posicao = 0; posicao < numeros.length; posicao++) {	
			if(posicao != 0) subtrai -= numeros[posicao]; else subtrai += numeros[posicao];
		}
		System.out.println("A soma dos numeros contidos no vetor � " + subtrai);
	}
	
	public void multiplicar(int numeros[]) {
		int multiplicar = 1;
		for(int posicao = 0; posicao < numeros.length; posicao++) {	
			multiplicar *= numeros[posicao];
		}
		System.out.println("A soma dos numeros contidos no vetor � " + multiplicar);
	}
	
	public void dividir(int numUm, int numDois) {
		int dividir = numUm / numDois;
		int modulo = numUm % numDois; 
		System.out.println("Divis�o de " + numUm + " por " + numDois + " � " + dividir);
		System.out.println("Modulo de " + numUm + " por " + numDois + " � " + modulo);
	}
	
}
