
public class TestaReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("a primeira conta tem " +primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("a segunda conta tem " +segundaConta.saldo);
		
		System.out.println();
		
		segundaConta.saldo+= 100;
		
		System.out.println("O novo saldo da segunda conta é " +segundaConta.saldo);
		
		System.out.println("A primeira conta permanece com " +primeiraConta.saldo);
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("São iguais");
			
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
