package Cotacao_Dolar;
import java.util.Scanner;

public class Dolar {
	public static void main(String[] args) 
	{
		double cotacao = 4.0;
		double resultado;
		double  qtd_dolar;
		
		System.out.println("Escreva o valor da cota��o do d�lar");
		
		 Scanner ler = new Scanner(System.in);
	
		 cotacao = ler.nextDouble();
		 
		 System.out.println("Escreva a quantidade de dolares");
		 qtd_dolar = ler.nextDouble();
		 
		 resultado = cotacao * qtd_dolar;
		 
		 System.out.println("O valor da cota��o � " +resultado);


	}


}
