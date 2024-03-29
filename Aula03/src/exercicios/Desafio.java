package exercicios;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		String jogoVelha[][] = new  String[3][3], jogador, vencedor = "N";
		int proximaLinha = 0, deadLine = 3, linha, coluna, jogadas = 0, opcao;
		boolean comecar;
		
		while(true) {
			
			comecar = true;
			
			for(linha = 0; linha < jogoVelha.length; linha++) {
				for(coluna = 0; coluna < jogoVelha[linha].length; coluna++) {
					jogoVelha[linha][coluna] = "  ";
					}
				}
			
			System.out.println("******JOGO DA VELHA*****");
			
			do {
				System.out.print("Informe qual jogador come�ar� a jogar. X ou O: ");
				jogador = leitura.next().toUpperCase();
			}while(jogador.equals("X") == false & jogador.equals("O") == false);
			
			while(comecar) {
				
				while(true) {
					
					do {
						System.out.println("Jogador " + jogador + " informe a linha e a coluna");
						System.out.print("Linha: ");
						linha = Integer.parseInt(leitura.next());
						System.out.print("Coluna: ");
						coluna = Integer.parseInt(leitura.next());
					}while((coluna < 0 || coluna > 2) || (linha < 0 || linha > 2));
					
					if(jogoVelha[linha][coluna].equals("  ")) {
						jogoVelha[linha][coluna] = " " + jogador;
						jogadas++;
						break;
					}else System.out.println("A coluna nessa linha j� est� preenchida com o" + jogoVelha[linha][coluna]);
				}
				
				for(linha = 0; linha < jogoVelha.length; linha++) {
					if((jogoVelha[linha][0].equals(jogoVelha[linha][1]) && jogoVelha[linha][0].equals(jogoVelha[linha][2])) && !jogoVelha[linha][0].equals("  ")) {
						vencedor = jogador;
						break;
					}
				}
					
				for(coluna = 0; coluna < jogoVelha.length; coluna++) {
					if(jogoVelha[0][coluna].equals(jogoVelha[1][coluna]) && jogoVelha[0][coluna].equals(jogoVelha[2][coluna]) && !jogoVelha[0][coluna].equals("  ")) {
						vencedor = jogador;
						break;
					}
				}
					
				if((jogoVelha[0][2].equals(jogoVelha[1][1]) && jogoVelha[0][2].equals(jogoVelha[2][0]) && !jogoVelha[1][1].equals("  ")) || 
						(jogoVelha[0][0].equals(jogoVelha[1][1]) && jogoVelha[0][0].equals(jogoVelha[2][2])) && !jogoVelha[1][1].equals("  ")) {
					vencedor = jogador;
				}
				
				for(linha = 0; linha < jogoVelha.length; linha++) {
					for(coluna = 0; coluna < jogoVelha[linha].length; coluna++) {
						
						if(proximaLinha < 2) System.out.print(jogoVelha[linha][coluna] + " |"); 
						else System.out.print(jogoVelha[linha][coluna]);
				
						proximaLinha++;
						
						if(proximaLinha == deadLine) {
							proximaLinha = 0;
							System.out.println();
						}
						}
					}
				
				if((vencedor.equals("N") && jogadas == 9) || vencedor.equals("O") || vencedor.equals("X")) {
					
					if(vencedor.equals("N") && jogadas == 9) {
						System.out.println("EMPATE!!"); 
					}else{
						System.out.println("O vencedor � " + vencedor + "!");
					}
					
					do {
						
						System.out.println("Deseja jogar novamente?\n1) Sim\n2) N�o");
						opcao = Integer.parseInt(leitura.next());
						
						switch(opcao) {
							case 1:
								vencedor = "N";
								jogadas = 0;
								comecar = false;
								break;
							case 2:
								System.exit(0);
								break;
							default:
								System.out.println("A op��o informada � inv�lida!");
								break;
						}
						
					}while(opcao != 1 && opcao != 2);
					
				}
				
				if(jogador.equals("X")) jogador = "O"; else jogador = "X";
			}		
		}
	}
}

