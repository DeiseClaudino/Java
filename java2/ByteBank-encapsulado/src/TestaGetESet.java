
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		System.out.println(conta.getnumero());
		
		
		
		Cliente paulo = new Cliente();
		
		conta.setTitular(paulo);
		
	}
}
