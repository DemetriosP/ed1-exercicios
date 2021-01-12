package exercicio3;

public class TesteClasses {
	
	public static void main(String args[]) {
		
		Vaca va = new Vaca();
		Cachorro cac = new Cachorro();
		Gato ga = new Gato();
		Cabrito cab = new Cabrito();
		Porco po = new Porco();
		
		System.out.println("A vaca faz: " + va.getSom());
		System.out.println("O cachorro faz: " + cac.getSom());
		System.out.println("O gato faz: " + ga.getSom());
		System.out.println("O cabrito faz: " + cab.getSom());
		System.out.println("O porco faz: " + po.getSom());
		
	}

}
