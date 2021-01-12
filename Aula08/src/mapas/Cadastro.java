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
			System.out.println("1) Cadastar Usuário\n2) Verificar Usuário Cadastrado\n3) Consultar Dados do Usuário\n"
					+ "4) Listar Pricipais Dados do Usuário\n5) Pesquisar Usuário Pelo Nome\n6) Remove Usuário\n"
					+ "7) Mostrar Total de Usuários Cadastrados\n8) Sair");
			opcao = Integer.parseInt(leitura.nextLine());
			
			switch(opcao) {
			
				case 1:
					System.out.print("Informe o RA do usuário: ");
					ra = Integer.parseInt(leitura.nextLine());
					System.out.print("Informe o nome do usuário: ");
					nome = leitura.nextLine();
					System.out.print("Informe o endereço do usuario: ");
					endereco = leitura.nextLine();
					System.out.print("Informe o email do usuário: ");	
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
					
					if(contem) System.out.println("O usuário já está cadastrado"); 
					else System.out.println("O usuário não está cadastrado");
					
					break;
				case 3:
					System.out.println("Lista dos Usuário");
					for(Object key : cadastro.keySet()) {
						System.out.println("Chave: " + key);
						System.out.println("RA: " + cadastro.get(key).getRa());
						System.out.println("Nome: " + cadastro.get(key).getNome());
						System.out.println("Endereço: " + cadastro.get(key).getEndereco());
						System.out.println("E-mail: " + cadastro.get(key).getEmail());
						System.out.println();
					}
					break;
				case 4:
					System.out.println("Lista dos principais dados do usuário");
					for(Object key : cadastro.keySet()) {
						System.out.println("Chave: " + key);
					}
					break;
				case 5:
					System.out.println("Informe o nome do usuário: ");
					nome = leitura.nextLine();
							
					for(Object key : cadastro.keySet()) {
						if(cadastro.get(key).getNome().contains(nome)) {
							System.out.println("Chave: " + key);
							System.out.println("RA: " + cadastro.get(key).getRa());
							System.out.println("Nome: " + cadastro.get(key).getNome());
							System.out.println("Endereço: " + cadastro.get(key).getEndereco());
							System.out.println("E-mail: " + cadastro.get(key).getEmail());
							System.out.println();
						} else System.out.println("Nenhum usuário é compativel com a busca");
					}
					break;
				case 6:
					System.out.println("Para remover o usuario, informa a sua chave: ");
					chavRem = Integer.parseInt(leitura.nextLine());
					
					if(cadastro.containsKey(chavRem)) {
						cadastro.remove(chavRem);
						System.out.println("O usuário foi removido com sucesso!");
					} else System.out.println("Não existe nenhum usuário com a chave informada.");
					
					break;
				case 7:
					if(cadastro.size() > 0) {
						System.out.println("Total de usuário cadastrado: " + cadastro.size());
					} else System.out.println("Não há nenhum usuário cadastrado");
					break;
				case 8:
					System.exit(0);
					break;
				default:
					System.out.println("A opção informada é inválida!");
			}
			
		}
	}
}
