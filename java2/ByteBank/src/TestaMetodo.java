
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 100;
		System.out.println("A conta do Paulo possui R$ " +contaDoPaulo.saldo);
		contaDoPaulo.deposita(50);		
		
		System.out.println("Após o depósito, o valor atual é R$ " +contaDoPaulo.saldo);
		
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		
		System.out.println("Após o saque, seu saldo é R$ " +contaDoPaulo.saldo);
		
		System.out.println(conseguiuRetirar);
	}
}
