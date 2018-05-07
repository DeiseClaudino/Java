
public class TestaFatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		for(int nAtual = 1; nAtual < 11; nAtual++) {
			fatorial *= nAtual;
			System.out.println("O fatorial de " +nAtual+ " é " +fatorial);
		}
	}
}
