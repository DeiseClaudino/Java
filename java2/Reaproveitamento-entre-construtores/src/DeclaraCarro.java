
public class DeclaraCarro {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setAno(2003);
		carro.setPreco(30000.0);
		
		System.out.println(carro.getAno());
		System.out.println(carro.getPreco());
	}
}
