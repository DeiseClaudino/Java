
public class Tarefa {
	public String recurso;

	public Tarefa(String recurso) {
		this.recurso = recurso;
	}
	public void run(){
		System.out.print("Tarefe em execu��o:\t");
		System.out.println(recurso);
	}


}
