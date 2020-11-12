package exercicio3;

import java.util.Scanner;

public class Calculadora {
	
public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int numUm = 0, numDois = 0, opcao, tamanho;
		OperacoesMatematicas calculadora = new OperacoesMatematicas();
		int numeros[] = null;
		
		while(true) {
			
			System.out.println("Calculadora");
			do {
				System.out.println("Escolha uma das opera��es abaixo:");
				System.out.println("1) Somar\n2) Subtrair\n3) Multiplicar\n4) Dividir\n5) Sair");
				opcao = Integer.parseInt(leitura.next());
			}while(opcao < 1 || opcao > 6);
			
			if(opcao == 4) {
				
				do {
					System.out.print("Informe o primeiro n�mero: ");
					numUm = Integer.parseInt(leitura.next());
					System.out.print("Informe o segundo n�mero: ");
					numDois = Integer.parseInt(leitura.next());
				}while(numDois == 0);
				
			}else if(opcao != 4 && opcao != 5){

				System.out.print("Informe o tamanho do vetor: ");
				tamanho = Integer.parseInt(leitura.next());
				
				numeros = new int[tamanho];
				
				System.out.println();
				for(int posicao = 0; posicao < numeros.length; posicao++) {
					System.out.println("Informe o n�mero para a posi��o " + (posicao + 1) + ": ");
					numeros[posicao] = Integer.parseInt(leitura.next());
				}
			}
			
			switch(opcao) {
			
				case 1:
					calculadora.somar(numeros);
					break;
				case 2:
					calculadora.subtrair(numeros);
					break;
				case 3:
					calculadora.multiplicar(numeros);
					break;
				case 4:
					calculadora.dividir(numUm, numDois);
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("Op��o informava inv�lida!");
					break;
			}
			
		}
		
	}

}
