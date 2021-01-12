package exerciciosAula06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Porto {
	
	public static void main(String args[]) {
		
		Conteiner cont1 = new Conteiner();
		Conteiner cont2 = new Conteiner();
		Conteiner cont3 = new Conteiner();
		Conteiner cont4 = new Conteiner();
		
		cont1.setNomeDoDestinatario("Petrobras");
		cont1.setPeso(500);
		cont2.setNomeDoDestinatario("Vale S.A.");
		cont2.setPeso(700);
		cont3.setNomeDoDestinatario("Shell");
		cont3.setPeso(692);
		cont4.setNomeDoDestinatario("Ipiranga");
		cont4.setPeso(321);
		
		Queue<Conteiner>porto = new LinkedList<Conteiner>();
		
		porto.add(cont1);
		System.out.println("contêiner 1");
		
		porto.add(cont2);
		System.out.println("contêiner 1 e contêiner 2");
		
		porto.add(cont3);
		System.out.println("contêiner 1, contêiner 2 e contêiner 3");
		
		porto.add(cont4);
		System.out.println("contêiner 1, contêiner 2, contêiner 3 e contêiner 4");
		
		Stack<Conteiner> navioCargueiro = new Stack<Conteiner>();
		
		navioCargueiro.add(cont1);
		navioCargueiro.add(cont2);
		navioCargueiro.add(cont3);
		navioCargueiro.add(cont4);
		
		for(Conteiner obj: navioCargueiro) {
			System.out.println(obj.getNomeDoDestinatario());
		}
	}
}
