package exerciciosAula07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestaAluno {
	
	public static void main(String args[]) {
		
		Scanner leitura = new Scanner(System.in);
		int prontuario, opcao;
		String nome;
		double mediaFinal;
		
		ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>(); //escolhi ArrayLista pois ela é mais rápida para acessar os dados
		
		while(true) {
			
			System.out.println("Bem vindo ao sistema! Selecione uma das opções abaixo.");
			System.out.println("1) Adicionar aluno à lista\n2) Exibir a lista de alunos\n"
					+ "3) Buscar aluno pelo nome\n4) Ordenar lista\n5) Inverter lista\n6) Sair");
			
			opcao = Integer.parseInt(leitura.nextLine());
			
			switch (opcao) {
			
				case 1:
					System.out.print("Informe o prontuário do aluno: ");
					prontuario = Integer.parseInt(leitura.nextLine());
					System.out.print("Informe o nome do aluno: ");
					nome = leitura.nextLine();
					System.out.print("Informe a média final do aluno: ");
					mediaFinal = Double.parseDouble(leitura.nextLine());
					
					listaAlunos.add(new Aluno(prontuario, nome, mediaFinal));

					System.out.println("O aluno foi inserido com sucesso");
					break;
				case 2:
					System.out.println("Lista de Alunos");
					
					if(listaAlunos.size() > 0) {
						for(int posicao = 0; posicao < listaAlunos.size(); posicao++) {
							System.out.println("Aluno: " + (posicao + 1));
							System.out.println("Prontuario: " + listaAlunos.get(posicao).getProntuario());
							System.out.println("Nome: " + listaAlunos.get(posicao).getNome());
							System.out.println("Média Final: " + listaAlunos.get(posicao).getMediaFinal());
						}
					}else System.out.println("A lista de alunos está vazia");
					
					break;
				case 3:
					System.out.print("Informe o nome da aluno a ser pesquisado: ");
					nome = leitura.nextLine();
						
					for(int posicao = 0; posicao < listaAlunos.size(); posicao++) {
						if(nome.equals(listaAlunos.get(posicao).getNome())) {
							System.out.println("Aluno: " + posicao + 1);
							System.out.println("Prontuario: " + listaAlunos.get(posicao).getProntuario());
							System.out.println("Nome: " + listaAlunos.get(posicao).getNome());
							System.out.println("Média Final: " + listaAlunos.get(posicao).getMediaFinal());
						}
					}
					break;
				case 4:
					for(int pos1 = 0; pos1 < listaAlunos.size(); pos1++) {
						for(int pos2 = 1; pos2 < listaAlunos.size(); pos2++) {
							listaAlunos.get(pos1).compareTo(listaAlunos.get(pos2));
						}
					}
					
					System.out.println("Lista ordenada!");
					break;
				case 5:
					Collections.reverse(listaAlunos);
					System.out.println("Lista invertida!");
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("A opção informada é invalida");
			}
		}
	}
}
