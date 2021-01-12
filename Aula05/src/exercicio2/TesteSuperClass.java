package exercicio2;

import java.util.Scanner;

public class TesteSuperClass {
	
public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		String modelo, fabricante, cor;
		int ano, nRodas, nMarchas;
		
		System.out.println("Preencha os dados do veículo");
		System.out.print("Modelo: ");
		modelo = leitura.next();
		
		System.out.print("Fabricante: ");	
		fabricante = leitura.next();
		
		System.out.print("Cor: ");	
		cor = leitura.next();
		
		System.out.print("Ano: ");	
		ano = Integer.parseInt(leitura.next());
		
		System.out.print("Número de rodas: ");	
		nRodas = Integer.parseInt(leitura.next());
		
		System.out.print("Número de marchas: ");	
		nMarchas = Integer.parseInt(leitura.next());
		
		leitura.close();
		
		Veiculo vei = new Veiculo(modelo, fabricante, cor, ano, nRodas, nMarchas);
		
		System.out.println("\nInformações do Carro");
		vei.getModelo();
		vei.getFabricante();
		vei.getAno();
		vei.getnRodas();
		vei.getCor();
		vei.getnMarchas();
		
	}

}
