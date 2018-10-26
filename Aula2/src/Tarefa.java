
public class Tarefa {
	public String recurso;

	public Tarefa(String recurso) {
		this.recurso = recurso;
	}
	public void run(){
		System.out.print("Tarefe em execução:\t");
		System.out.println(recurso);
	}


}
