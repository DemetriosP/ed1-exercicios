package exercicio2;

import java.util.Scanner;

public class TesteSubClass {
	
	public static void main(String args[]) {
		
		Scanner leitura = new Scanner(System.in);
		String modelo, fabricante, cor, temBau, temCesta;
		int ano, nRodas, nMarchas, nPortas;
		
		System.out.println("Prencha as informa��es do Carro");
		System.out.print("Modelo: ");
		modelo = leitura.next();
		System.out.print("Fabricante: ");	
		fabricante = leitura.next();
		System.out.print("Cor: ");	
		cor = leitura.next();
		System.out.print("Ano: ");	
		ano = Integer.parseInt(leitura.next());
		System.out.print("N�mero de rodas: ");	
		nRodas = Integer.parseInt(leitura.next());
		System.out.print("N�mero de marchas: ");	
		nMarchas = Integer.parseInt(leitura.next());
		System.out.println("N�mero de portas: ");
		nPortas = Integer.parseInt(leitura.next());
		
		Carro car = new Carro(modelo, fabricante, cor, ano, nRodas, nMarchas, nPortas);
		
		System.out.println("Prencha as informa��es da Bicicleta");
		System.out.print("Modelo: ");
		modelo = leitura.next();
		System.out.print("Fabricante: ");	
		fabricante = leitura.next();
		System.out.print("Cor: ");	
		cor = leitura.next();
		System.out.print("Ano: ");	
		ano = Integer.parseInt(leitura.next());
		System.out.print("N�mero de rodas: ");	
		nRodas = Integer.parseInt(leitura.next());
		System.out.print("N�mero de marchas: ");	
		nMarchas = Integer.parseInt(leitura.next());
		System.out.println("A bicicleta tem cesta? ");
		temCesta = leitura.next();
		
		Bicicleta bic = new Bicicleta(modelo, fabricante, cor, temCesta, ano, nRodas, nMarchas);
		
		System.out.println("Prencha as informa��es da Bicicleta");
		System.out.print("Modelo: ");
		modelo = leitura.next();
		System.out.print("Fabricante: ");	
		fabricante = leitura.next();
		System.out.print("Cor: ");	
		cor = leitura.next();
		System.out.print("Ano: ");	
		ano = Integer.parseInt(leitura.next());
		System.out.print("N�mero de rodas: ");	
		nRodas = Integer.parseInt(leitura.next());
		System.out.print("N�mero de marchas: ");	
		nMarchas = Integer.parseInt(leitura.next());
		System.out.println("A moto tem b�u? ");
		temBau = leitura.next();
		
		leitura.close();
		
		Moto mot = new Moto(modelo, fabricante, cor, temBau, ano, nRodas, nMarchas);
		
		System.out.println("\nInforma��es do Carro");
		car.getModelo();
		car.getFabricante();
		car.getAno();
		car.getnRodas();
		car.getCor();
		car.getnMarchas();
		car.getnPortas();
		
		System.out.println("\nInforma��es da Bicileta");
		car.getModelo();
		car.getFabricante();
		car.getAno();
		car.getnRodas();
		car.getCor();
		car.getnMarchas();
		car.getnPortas();
		
		System.out.println("\nInforma��es da Moto");
		bic.getModelo();
		bic.getFabricante();
		bic.getAno();
		bic.getnRodas();
		bic.getCor();
		bic.getnMarchas();
		bic.getTemCesta();
	}

}
