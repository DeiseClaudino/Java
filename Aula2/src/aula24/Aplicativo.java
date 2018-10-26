package aula24;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Aplicativo {

	public static void main(String[] args) {
		
		ExecutorService poolthread = Executors.newFixedThreadPool(6);
		try{
			poolthread.execute(new Tarefa("job1"));
			poolthread.execute(new Tarefa("job2"));
			poolthread.execute(new Tarefa("job3"));
			poolthread.execute(new Tarefa("job4"));
			poolthread.execute(new Tarefa("job5"));
			poolthread.execute(new Tarefa("job6"));
		}
		catch(Exception erro){
			erro.printStackTrace();
			
		}
	

		System.out.println("fim do metodo man");
		
		poolthread.shutdown();
		
	}

}