package repeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args){

		Scanner leitura = new Scanner(System.in);
		String sexo;

		System.out.println("Informe o seu sexo: ");
		sexo = leitura.next().toUpperCase();

		if(sexo.equals("M")){
			System.out.println("Você é do sexo masculino");
		}else if(sexo.equals("S")){
			System.out.println("Você é do sexo feminino");
		}else{
			System.out.println("Caracter informado é invalido");
		}
	}

}
