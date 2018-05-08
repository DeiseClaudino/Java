
public class TestaWhile {
	public static void main(String[] args) {
		int contador =0;
		
		while(contador <= 10) {
			System.out.println(contador);
			contador += 1;
			//Outras formas de calculo: contador = contador+1; ++contador; *O pós decremento causará loop infinito de 0.
		}
	}
}
