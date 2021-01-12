package exercicio1;

import java.util.Scanner;

public class CadastroCarro {
	
public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		Veiculo carro = new Veiculo();
		Veiculo moto = new Veiculo();
		
		System.out.println("Preencha os dados do carro");
		System.out.print("Informe o modelo do carro: ");
		carro.setModelo(leitura.next());
		
		System.out.print("Informe o fabricante do carro: ");	
		carro.setFabricante(leitura.next());
		
		System.out.print("Informe o ano do carro: ");	
		carro.setAno(Integer.parseInt(leitura.next()));
		
		System.out.print("Informe o número de portas do carro: ");	
		carro.setnPortas(Integer.parseInt(leitura.next()));
		
		System.out.print("Informe o número de rodas do carro: ");	
		carro.setnRodas(Integer.parseInt(leitura.next()));
		
		System.out.print("Informe a cor do carro: ");	
		carro.setCor(leitura.next());
		
		System.out.print("Informe o número de marchas do carro: ");	
		carro.setnMarchas(Integer.parseInt(leitura.next()));
		
		System.out.println("\nPreencha os dados da moto");
		System.out.print("Informe o modelo da moto: ");
		moto.setModelo(leitura.next());
		
		System.out.print("Informe o fabricante da moto: ");	
		moto.setFabricante(leitura.next());
		
		System.out.print("Informe o ano da moto: ");	
		moto.setAno(Integer.parseInt(leitura.next()));
		
		System.out.print("Informe o número de portas da moto: ");	
		moto.setnPortas(Integer.parseInt(leitura.next()));
		
		System.out.print("Informe o número de rodas da moto: ");	
		moto.setnRodas(Integer.parseInt(leitura.next()));
		
		System.out.print("Informe a cor da moto: ");	
		moto.setCor(leitura.next());
		
		System.out.print("Informe o número de marchas da moto: ");	
		moto.setnMarchas(Integer.parseInt(leitura.next()));
		
		System.out.println("\nInformações do Carro");
		carro.getModelo();
		carro.getFabricante();
		carro.getAno();
		carro.getnPortas();
		carro.getnRodas();
		carro.getCor();
		carro.getnMarchas();
		
		System.out.println("\nInformações da Moto");
		moto.getModelo();
		moto.getFabricante();
		moto.getAno();
		moto.getnPortas();
		moto.getnRodas();
		moto.getCor();
		moto.getnMarchas();
	}

}
