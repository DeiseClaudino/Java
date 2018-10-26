package Aula2;

public class Aplicativo {

	public static void main(String[] args) {
		Tarefa job1 = new Tarefa("job1");
		Tarefa job2 = new Tarefa("job2");
		Tarefa job3 = new Tarefa("job3");
		Tarefa job4 = new Tarefa("job4");
		Tarefa job5 = new Tarefa("job5");
		Tarefa job6 = new Tarefa("job6");
		job1.start();
		job2.start();
		job3.start();
		job4.start();
		job5.start();
		job6.start();
		System.out.println("fim do metodo man");
		
	}
	}
