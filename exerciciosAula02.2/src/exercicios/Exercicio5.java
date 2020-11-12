package exercicios;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args){

		Scanner leitura = new Scanner(System.in);
		double peso;

		System.out.println("Infome seu peso: ");
		peso = leitura.nextDouble();

		if(peso <= 56.7){
			System.out.println("Peso Mosca");
		}else if(peso > 56.7 & peso <= 61.2){
			System.out.println("Peso Galo");
		}else if(peso > 61.2 & peso <= 65.8){
			System.out.println("Peso Pena");
		}else if(peso > 65.8 & peso <= 70.3){
			System.out.println("Peso Leve");
		}else if(peso > 70.3 & peso <= 77.6){
			System.out.println("Peso Meio-médio");
		}else if(peso > 77.6 & peso <= 83.9){
			System.out.println("Peso Médio");
		}else if(peso > 83.9 & peso <= 93){
			System.out.println("Peso Meio-pesado");
		}else if(peso > 93 & peso <= 120.2){
			System.out.println("Peso Pesado");
		}else{
			System.out.println("Não permitido");
		};

	}	

}
