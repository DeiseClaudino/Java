public class Conta {
	private double saldo;
	int agencia =42;
	int numero;
	Cliente titular;
	
	/*Cliente titular = new Cliente(); já inicializa a classe cliente a partir 
	do momento que é inicializada a classe Conta */
	
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
	
	public double getSaldo() {
		return this.saldo;
	}
}