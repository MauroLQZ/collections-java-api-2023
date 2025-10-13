package pratica;

import java.util.ArrayList;
import java.util.List;

import list.OperacoesBasicas.Tarefa;

/** Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é 
 * representada por uma classe chamada "Tarefa" que possui um atributo de descrição. 
 * Implemente os seguintes métodos*/
public class ListaTarefas {
	
	private List<Tarefa> tarefaLista;

	public ListaTarefas() {
		this.tarefaLista = new ArrayList<>();
	}
	
	//Adiciona uma nova tarefa à lista com a descrição fornecida.
	public void adicionarTarefa(String descricao) {
		tarefaLista.add(new Tarefa(descricao));
	}
		
	//Remove uma tarefa da lista com base em sua descrição.	
	public void  removerTarefa(String descricao) {
		
		List<Tarefa> removeTarefa = new ArrayList<>();
		for(Tarefa t : tarefaLista) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				removeTarefa.add(t);
			}
		}
		//removeTarefa.addAll(removeTarefa);
		tarefaLista.removeAll(removeTarefa);
	}
		
	//Retorna o número total de tarefas na lista.
	public int obterNumeroTotalTarefas() {
		return tarefaLista.size();
	}
		
	// Retorna uma lista contendo a descrição de todas as tarefas na lista.
	public void obterDescricoesTarefas() {
		for(Tarefa t : tarefaLista) {
			System.out.println(t);
		}
	}
	/** Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é 
	 * representada por uma classe chamada "Tarefa" que possui um atributo de descrição. 
	 * Implemente os seguintes métodos:
	 * 
- adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.
- removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.
- obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
- obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.*/
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		System.out.println("Ver o tamanho da Lista de Tarefas:");
		System.out.println("----------------------------------");
		System.out.println(listaTarefas.obterNumeroTotalTarefas());
		
		System.out.println("ADD tarefas para Lista de Tarefas:");
		System.out.println("----------------------------------");
		listaTarefas.adicionarTarefa("Cozinhando o Almoço!");
		listaTarefas.adicionarTarefa("Lavando a Louça!");
		listaTarefas.adicionarTarefa("Varrendo a Cozinha!");
		listaTarefas.adicionarTarefa("Escovando os dentes!");
		listaTarefas.adicionarTarefa("Tomando banho!");
		listaTarefas.adicionarTarefa("Varrendo a Cozinha!");
		listaTarefas.adicionarTarefa("Varrendo a cozinha!");
		System.out.println(listaTarefas.obterNumeroTotalTarefas());
		
		System.out.println("Relaçao da Lista de Tarefas:");
		System.out.println("----------------------------");
		listaTarefas.obterDescricoesTarefas();
		
		System.out.println("Removendo elementos da Lista de Tarefas:");
		System.out.println("----------------------------------------");
		listaTarefas.removerTarefa("Varrendo a Cozinha!");
		
		System.out.println("Ver o tamanho da Lista de Tarefas:");
		System.out.println("----------------------------------");
		System.out.println(listaTarefas.obterNumeroTotalTarefas());
		listaTarefas.obterDescricoesTarefas();
		
		
	}

}



















