public class Conta {
	double saldo;
	int agencia =42;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		//saldo = saldo + valor
		this.saldo += valor;
	}
	//this é opcional
	public boolean saca(double valor) {
		if(this.saldo>= valor) {
			this.saldo-= valor;
			return true;
			
		}else {
			System.out.println("Saldo menor que o solicitado no saque");
			return false;
		}
		
		
	}
	
	//    boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>= valor) {
			this.saldo-= valor;
			destino.deposita(valor);
			System.out.println("Transferido com sucesso!");
			return true;	
			
		}else {
			System.out.println("Saldo menor que o solicitado na transferência");
			return false;
		}
	}
	
}