
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(1337);
		System.out.println(conta.getnumero());
		
		
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		//System.out.println(paulo.getNome()); outa forma de impimir o nome do cliente
		
		System.out.println(conta.getTitular().getProfissao());
	}
}
