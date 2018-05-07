
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario = 1250.70;
		System.out.println("meu salário é " + salario);
		
		
		//como os numeros divididos são inteiros, o resultado é um inteiro(2) que se torna double.
		double divisao = 5 / 2;
		System.out.println(divisao);
		
		//Nesse caso, como tornamos o número 5 em um double ele nos retorna o valor esperado.
		double outraDivisao = 5.0 / 2;
		System.out.println(outraDivisao);
		
		double calcula = 3.14 / 2;
		System.out.println(calcula);
		
	}
}
