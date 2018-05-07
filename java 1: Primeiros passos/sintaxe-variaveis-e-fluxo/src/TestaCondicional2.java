
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando Condicionais com operadores lógicos");
		int idade = 19;
		boolean acompanhado = true;
		// OU   int quantidadePessoas = 3;
        //boolean acompanhado = quantidadePessoas >= 2;
		
		if(idade >= 18 && acompanhado ) {
			System.out.println("Bem vindo");
		}
		else {
			System.out.println("Você não pode entrar");
		}
	}

}
