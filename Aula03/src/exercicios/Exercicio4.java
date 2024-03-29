package exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int mat1[][] = new int[4][2];
		int mat2[][] = new int[2][4];
		
		Scanner leitura = new Scanner(System.in);
		
		for(int linha = 0; linha < mat1.length; linha++) {
			for(int coluna = 0; coluna < mat1[linha].length; coluna++) {
				System.out.print("Informe um n�mero para preencher a " + 
				(coluna + 1) + " coluna da linha " + (linha + 1) + ": ");
				mat1[linha][coluna] = Integer.parseInt(leitura.nextLine());
				}
			}
		
		for(int linha = 0; linha < mat2.length; linha++) {
			for(int coluna = 0; coluna < mat2[linha].length; coluna++) {
				mat2[linha][coluna] = mat1[coluna][linha];
				}
			}
		
		System.out.println("MATRIZ ORIGINAL");
		for(int [] row : mat1) System.out.println(Arrays.toString(row));
		System.out.println("\nMATRIZ TRANSPOSTA");
		for(int [] row : mat2) System.out.println(Arrays.toString(row));
		
	}
}

