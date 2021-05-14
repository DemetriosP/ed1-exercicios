package repeticao;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int opcao;
		String idioma;
		
		System.out.print("Informe um número de 0 a 10: ");
		opcao = leitura.nextInt();
		
		System.out.print("Escolha o idioma: P para português ou I para inglês: ");
		idioma = leitura.next().toUpperCase();
		
		switch(opcao) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				if(idioma.equals("I")){
					System.out.println("One");
				}else {
					System.out.println("Um");
				}
				break;
			case 2:
				if(idioma.equals("I")){
					System.out.println("Two");
				}else {
					System.out.println("Dois");
				}
				break;
			case 3:
				if(idioma.equals("I")){
					System.out.println("Three");
				}else {
					System.out.println("Três");
				}
				break;
			case 4:
				if(idioma.equals("I")){
					System.out.println("Four");
				}else {
					System.out.println("Quatro");
				}
				break;
			case 5:
				if(idioma.equals("I")){
					System.out.println("Five");
				}else {
					System.out.println("Cinco");
				}
				break;
			case 6:
				if(idioma.equals("I")){
					System.out.println("Six");
				}else {
					System.out.println("Seis");
				}
				break;
			case 7:
				if(idioma.equals("I")){
					System.out.println("Seven");
				}else {
					System.out.println("Sete");
				}
				break;
			case 8:
				if(idioma.equals("I")){
					System.out.println("Eight");
				}else {
					System.out.println("Oito");
				}
				break;
			case 9:
				if(idioma.equals("I")){
					System.out.println("Nine");
				}else {
					System.out.println("Nove");
				}
				break;
			case 10:
				if(idioma.equals("I")){
					System.out.println("Ten");
				}else {
					System.out.println("Dez");
				}
				break;
			default:
				System.out.println("O número escolhido é inválida");
				break;
		}
	}

}