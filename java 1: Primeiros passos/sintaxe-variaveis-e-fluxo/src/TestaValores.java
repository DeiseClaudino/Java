
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		//copiamos 5 para dentro de segundo, e depois copiamos 10 para primeiro, a linha segundo = primeiro; não diz nada.
		System.out.println(segundo);
	}
}
