package Polegada_Poo;

public class Polegada {

   double polegada, milimetro;
	public Polegada(double polegada, double milimetro) {
		this.polegada = polegada;
		this.milimetro = milimetro;
	}
            public void run(){
            	final double val_milimetro;
            	 val_milimetro = 25.4;
                	milimetro = polegada * val_milimetro;
        		     System.out.println("O resultado é: "+  milimetro);
            }
            
	}
