package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int tamanho = 0, posicao = 0, repitido = 0, imprimir = 0;
		
		do {
			System.out.print("Você deseja preecher o vetor 1 com quantos numeros? Escolha de 1 a 5: ");
			tamanho = Integer.parseInt(leitura.nextLine()); 
		}while(tamanho < 1 || tamanho > 5);
		
		int [] v1 = new int[tamanho];
		
		do {
			System.out.print("Você deseja preecher o vetor 2 com quantos numeros? Escolha de 1 a 5: ");
			tamanho = Integer.parseInt(leitura.nextLine()); 
		}while(tamanho < 1 || tamanho > 5);
		
		int [] v2 = new int[tamanho];
		
		for(int volta = 0; volta <= v1.length; volta++) {
			System.out.print("Informe um numero inteiro para o primeiro vetor: ");
			v1[volta] = Integer.parseInt(leitura.nextLine()); 
		}
		
		for(int volta = 0; volta <= v2.length; volta++) {
			System.out.print("Informe um numero inteiro para o segundo vetor: ");
			v1[volta] = Integer.parseInt(leitura.nextLine()); 
		}
		
		int [] v3 = new int[v1.length + v2.length];
		
		for(int i = 0; i < v1.length; i++) {	
			for(int j = 0; j < v2.length; j++) {
				
				if(v1[i] == v2[j]) {
					
					for(int x = 0; x <= posicao; x++) {
						if(v3[x] == v1[i]) repitido = 1;
					}
					
					if(repitido != 1) {
						v3[posicao++] = v1[i];
						imprimir++;
					}
				}
				
				repitido = 0;
			}
		}
		
		for(int y = 0; y < imprimir; y++) {
			System.out.print(v3[y] + " ");
		}
		
	}
}
