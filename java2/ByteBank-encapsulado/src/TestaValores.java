
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337,24226);
		
		
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta(2334,12354);
		
		Conta conta3 = new Conta(8765,43210 );
		
		System.out.println(conta2.getAgencia());
		
		System.out.println(conta3.getAgencia());
	}
}
