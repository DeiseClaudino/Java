package aula24;

public class Tarefa implements Runnable{

	public String recurso;

	public Tarefa(String recurso) {
		this.recurso = recurso;
	}
	@Override
	public void run(){
		System.out.print("Tarefa em execu��o:\t");
		System.out.println(recurso);
	}

	

}
