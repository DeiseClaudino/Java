package aula24;

public class Tarefa implements Runnable{

	public String recurso;

	public Tarefa(String recurso) {
		this.recurso = recurso;
	}
	@Override
	public void run(){
		System.out.print("Tarefa em execução:\t");
		System.out.println(recurso);
	}

	

}
