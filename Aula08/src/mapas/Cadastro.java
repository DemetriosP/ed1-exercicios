package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro {

	public static void main(String args[]) {
		
		Map<Integer, Usuario> cadastro = new HashMap<>();
		Scanner leitura = new Scanner(System.in);
		int opcao, chave = 1, ra, chavRem;
		String nome, endereco, email;
		
		while(true) {
			
			System.out.println("Menu");
			System.out.println("1) Cadastar Usu�rio\n2) Verificar Usu�rio Cadastrado\n3) Consultar Dados do Usu�rio\n"
					+ "4) Listar Pricipais Dados do Usu�rio\n5) Pesquisar Usu�rio Pelo Nome\n6) Remove Usu�rio\n"
					+ "7) Mostrar Total de Usu�rios Cadastrados\n8) Sair");
			opcao = Integer.parseInt(leitura.nextLine());
			
			switch(opcao) {
			
				case 1:
					System.out.print("Informe o RA do usu�rio: ");
					ra = Integer.parseInt(leitura.nextLine());
					System.out.print("Informe o nome do usu�rio: ");
					nome = leitura.nextLine();
					System.out.print("Informe o endere�o do usuario: ");
					endereco = leitura.nextLine();
					System.out.print("Informe o email do usu�rio: ");	
					email = leitura.nextLine();
					
					cadastro.put(chave, new Usuario(ra, nome, endereco, email));
					chave++;
					
					break;
				case 2:
					
					boolean contem = false;
					
					System.out.print("Informe o RA do funcionario: ");
					ra = Integer.parseInt(leitura.nextLine());
					
					for(Object key : cadastro.keySet()) {
						if(cadastro.get(key).getRa() == ra) contem = true;
					}
					
					if(contem) System.out.println("O usu�rio j� est� cadastrado"); 
					else System.out.println("O usu�rio n�o est� cadastrado");
					
					break;
				case 3:
					System.out.println("Lista dos Usu�rio");
					for(Object key : cadastro.keySet()) {
						System.out.println("Chave: " + key);
						System.out.println("RA: " + cadastro.get(key).getRa());
						System.out.println("Nome: " + cadastro.get(key).getNome());
						System.out.println("Endere�o: " + cadastro.get(key).getEndereco());
						System.out.println("E-mail: " + cadastro.get(key).getEmail());
						System.out.println();
					}
					break;
				case 4:
					System.out.println("Lista dos principais dados do usu�rio");
					for(Object key : cadastro.keySet()) {
						System.out.println("Chave: " + key);
					}
					break;
				case 5:
					System.out.println("Informe o nome do usu�rio: ");
					nome = leitura.nextLine();
							
					for(Object key : cadastro.keySet()) {
						if(cadastro.get(key).getNome().contains(nome)) {
							System.out.println("Chave: " + key);
							System.out.println("RA: " + cadastro.get(key).getRa());
							System.out.println("Nome: " + cadastro.get(key).getNome());
							System.out.println("Endere�o: " + cadastro.get(key).getEndereco());
							System.out.println("E-mail: " + cadastro.get(key).getEmail());
							System.out.println();
						} else System.out.println("Nenhum usu�rio � compativel com a busca");
					}
					break;
				case 6:
					System.out.println("Para remover o usuario, informa a sua chave: ");
					chavRem = Integer.parseInt(leitura.nextLine());
					
					if(cadastro.containsKey(chavRem)) {
						cadastro.remove(chavRem);
						System.out.println("O usu�rio foi removido com sucesso!");
					} else System.out.println("N�o existe nenhum usu�rio com a chave informada.");
					
					break;
				case 7:
					if(cadastro.size() > 0) {
						System.out.println("Total de usu�rio cadastrado: " + cadastro.size());
					} else System.out.println("N�o h� nenhum usu�rio cadastrado");
					break;
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("A op��o informada � inv�lida!");
			}
			
		}
	}
}
