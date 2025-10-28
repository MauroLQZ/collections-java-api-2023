package pratica;

import java.util.ArrayList;
import java.util.List;

/* Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. 
 * Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. 
 * Implemente os seguintes métodos:*/
public class ListaTarefa {
	private List<Tarefa> listaTarefa;

	public ListaTarefa() {
		this.listaTarefa = new ArrayList<>();
	}
	//Adiciona uma nova tarefa à lista com a descrição fornecida.
	public void adicionarTarefa(String descricao) {
		this.listaTarefa.add(new Tarefa(descricao));
	}
	//Remove uma tarefa da lista com base em sua descrição.
	public void removerTarefa(String descricao) {
		List<Tarefa> removeTarefa = new ArrayList<>();		
		if(this.listaTarefa == null)
			return;
		
		for(Tarefa t : listaTarefa) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				removeTarefa.add(t);
			}
		}
		
		listaTarefa.removeAll(removeTarefa);
	}
	
	//Retorna o número total de tarefas na lista.
	public int obterNumeroTotalTarefas() {
		return listaTarefa.size();
	}
	//Retorna uma lista contendo a descrição de todas as tarefas na lista.
	public void obterDescricoesTarefas() {
		for(Tarefa t: listaTarefa) {
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		ListaTarefa lista = new ListaTarefa();
		System.out.println("Tamanho da Lista de Tarefa:");
		System.out.println("---------------------------");
		System.out.println(lista.obterNumeroTotalTarefas());
		lista.adicionarTarefa("Acordar!");
		lista.adicionarTarefa("Lavar rosto!");
		lista.adicionarTarefa("Tomar café!");
		lista.adicionarTarefa("Lavar louça!");
		lista.adicionarTarefa("Lavar rosto!");
		lista.adicionarTarefa("Almoçar!");
		lista.adicionarTarefa("Lavar rosto!");
		lista.adicionarTarefa("Escovar os dentes!");
		System.out.println("Tamanho da Lista de Tarefa:");
		System.out.println("---------------------------");
		System.out.println(lista.obterNumeroTotalTarefas());
		System.out.println("Relação da Lista de Tarefa:");
		System.out.println("---------------------------");
		lista.obterDescricoesTarefas();
		System.out.println("---------------------------");
		System.out.println("Removendo Tarefa: Lavar rosto!");
		lista.removerTarefa("Lavar rosto!");
		System.out.println("Tamanho da Lista de Tarefa:");
		System.out.println("---------------------------");
		System.out.println(lista.obterNumeroTotalTarefas());
		System.out.println("Relação da Lista de Tarefa:");
		System.out.println("---------------------------");
		lista.obterDescricoesTarefas();
	}
		
}//FIM classe ListaTarefa
