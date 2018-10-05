package Polegada_PE;

import java.util.Scanner;
public class Polegada 
{
	public static void main(String[] args) 
	{
		double polegada, milimetro;
		final double milimetroc = 25.4;;
		
		System.out.println("Medidor de polegada");
		System.out.println("-----------------------");
		System.out.println();
		System.out.println("Informe o valor em polegada:");
		
		Scanner ler = new Scanner(System.in);	
		polegada = ler.nextDouble();
		milimetro = polegada * milimetroc;
		
		System.out.println("O resultado é: "+  milimetro);
		
	}

}
