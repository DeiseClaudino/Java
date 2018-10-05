package Polegada_Poo;
import java.util.Scanner;
public class Aplicativo {

		public static void main(String[] args) {
		 double polegada;
		 Scanner ler = new Scanner(System.in);
		 
		 System.out.println("Medidor de polegada");
			System.out.println("-----------------------");
			System.out.println();
			System.out.println("Informe o valor em polegada:");
			
		 polegada = ler.nextDouble();
		   Polegada val_polegada = new Polegada(polegada, polegada);
		    val_polegada.run();
		    System.out.println("Fim do método main - aplicativo");
	}

}
