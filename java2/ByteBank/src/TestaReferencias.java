
public class TestaReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("a primeira conta tem " +primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("a segunda conta tem " +segundaConta.saldo);

		
	}
}
