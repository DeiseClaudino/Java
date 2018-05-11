
public class DeclaraCarro {

	public static void main(String[] args) {
		Carro carro = new Carro(2003, "Gol", 3200.0);
		
		System.out.println(carro.getModelo());
		
		
		Carro outroCarro = new Carro("Civic", 25000.0);
		System.out.println(outroCarro.getModelo());

		System.out.println(outroCarro);
		System.out.println(carro);
	}
}
