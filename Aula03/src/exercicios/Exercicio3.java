package exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int mat1[][] = new int[2][2];
		int mat2[][] = new int[2][2];
		int mat3[][] = new int[2][2];
		
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
				System.out.print("Informe um n�mero para preencher a " + 
				(coluna + 1) + " coluna da linha " + (linha + 1) + ": ");
				mat2[linha][coluna] = Integer.parseInt(leitura.nextLine());
				}
			}
		
		for(int linha = 0; linha < mat3.length; linha++) {
			for(int coluna = 0; coluna < mat2[linha].length; coluna++) {
				mat3[linha][coluna] = mat1[linha][coluna] + mat2[linha][coluna];
				}
			}
		
		System.out.println("MATRIZ 1");
		for(int [] row : mat1) System.out.println(Arrays.toString(row));
		System.out.println("\nMATRIZ 2");
		for(int [] row : mat2) System.out.println(Arrays.toString(row));
		System.out.println("\nMATRIZ SOMA");
		for(int [] row : mat3) System.out.println(Arrays.toString(row));
	}
}



























