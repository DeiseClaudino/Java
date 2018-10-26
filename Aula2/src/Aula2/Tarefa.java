package Aula2;

public class Tarefa extends Thread{

	public String recurso;

	public Tarefa(String recurso) {
		this.recurso = recurso;
	}
	@Override
	public void run(){
		System.out.print("Tarefe em execução:\t");
		System.out.println(recurso);
	}

	

}
