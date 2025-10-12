package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

/* Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. 
 * Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. 

 * Sempre que eu criar uma ListaTarefa terei instanciado um ArrayList vazio para trabalhar.*/
public class ListaTarefa {
	// atributo
	private List<Tarefa> tarefaList;

	// Nao quero receber nenhum parametro,só vou criar um ArrayList vazia
	public ListaTarefa() {
		// criando um ArrayList vazio
		this.tarefaList = new ArrayList<>();
	}

	
	// Metodos sobrecarregados de ArrayList
	// add(Tarefa e)-passa a tarefa que eu quero add dentro
	// add(int index, Tarefa element)-add elemento apartir do indece.
	// addAll(Collection<? extends Tarefa> c)-passo uma coleção completa p/colocar
	// dentro desta List
	// addAll(int index,Collection<? extends Tarefa> c)-passo o indice e uma coleçao
	// p/pegar elemento do indice
	
	// Adiciona uma nova tarefa à lista com a descrição fornecida.
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	// Remove uma tarefa da lista com base em sua descrição.
	//Utiliza o removeAll,pois pode ter uma elemento da lista repetido e para isso
	//add numa ArrayList para remover todos os elementos repetidos(se tiver)
	//por isso cria um Arraylist de varios elementos(repetidos)p/excluir todos.
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}

	// Retorna o número total de tarefas na lista.
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);	
	}
	
	// Retorna uma lista contendo a descrição de todas as tarefas na lista
	/*public void obterDescricoesTarefas() {
		if (!tarefaList.isEmpty()) {
			System.out.println(tarefaList);
		} else {
			System.out.println("A lista está vazia!");
		}
	} */

	public static void main(String[] args) {
		// Criando uma instância da classe ListaTarefa
		ListaTarefa listaTarefa = new ListaTarefa();

		// Adicionando tarefas à lista
		listaTarefa.adicionarTarefa("Comprar leite");
		listaTarefa.adicionarTarefa("Estudar para o exame");
		listaTarefa.adicionarTarefa("Fazer exercícios");

		System.out.println("Numero Total de Tarefas:");
		System.out.println("------------------------");
		// Exibindo o número total de tarefas na lista
		System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

		System.out.println("\nExibindo as descricoes das tarefas:");
		System.out.println("-------------------------------------");
		// Exibindo as descrições das tarefas na lista
		listaTarefa.obterDescricoesTarefas();

		System.out.println("\nRemovendo a tarefa:Trabalhar:");
		System.out.println("-------------------------------");
		// Removendo uma tarefa da lista
		listaTarefa.removerTarefa("Trabalhar");

		System.out.println("\nNumero total de tarefas:");
		System.out.println("--------------------------");
		// Exibindo o número total de tarefas na lista após a remoção
		System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

		System.out.println("\nExibindo as descricoes das tarefas atualizadas:");
		System.out.println("-------------------------------------------------");
		// Exibindo as descrições das tarefas atualizadas na lista
		listaTarefa.obterDescricoesTarefas();

		System.out.println("\nRemovendo uma tarefa da lista:Estudar para o exame");
		System.out.println("----------------------------------------------------");
		// Removendo uma tarefa da lista quando a lista está vazia
		listaTarefa.removerTarefa("Estudar para o exame");

		System.out.println("\nExibindo o número total de tarefas na lista:");
		System.out.println("----------------------------------------------");
		// Exibindo o número total de tarefas na lista após tentar remover de uma lista
		System.out.println("Agora você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");
	}//FIM main
}//FIM class ListaTarefa
