package exercicios;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		int anoNascimento, anoAtual, anos, meses, dias, minutos, segundos;
		
		System.out.println("Informe o ano atual: ");
		anoAtual = leitura.nextInt();
		
		System.out.println("Informe seu ano de nascimento: ");
		anoNascimento = leitura.nextInt();
		
		anos = anoAtual - anoNascimento;
		meses = anos * 12;
		dias = meses * 30;
		minutos = (dias * 24) * 60;
		segundos = minutos * 60;
		
		System.out.println("Você viveu " + anos + " anos, " + meses + " meses, "
		+ dias + " dias, " + minutos + " minutos e "+ segundos + " segundos.");
	}

}
