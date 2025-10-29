package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

/* Classe possui um conjunto de objetos do tipo "Tarefa" como atributo.*/
public class ListaTarefas {
	Set<Tarefa> tarefaSet;

	public ListaTarefas() {
		this.tarefaSet = new HashSet<>();
	}

	// Adiciona uma nova tarefa ao Set.
	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao));
	}

	// Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		
		if (!tarefaSet.isEmpty()) {

			for (Tarefa t : tarefaSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaRemover = t;
					break;
				}
			}
			if (tarefaParaRemover != null) {
				tarefaSet.remove(tarefaParaRemover);
			} else {
				System.out.println("Tarefa não encontrada!");
			}
		} else {
			System.out.println("Tarefa não encontrada!");
		}
	}

	// Exibe todas as tarefas da lista de tarefas.
	public void exibirTarefas() {
		if (!tarefaSet.isEmpty()) {
			System.out.println(tarefaSet);
		} else {
			System.out.println("O conjunto de tarefas esta vazio!");
		}
	}

	// Conta o número total de tarefas na lista de tarefas.
	public int contarTarefas() {
		return tarefaSet.size();

	}

	// Retorna um Set com as tarefas concluídas.
	public Set<Tarefa> obterTarefasConcluidas() {
		Set<Tarefa> tarefaConcluida = new HashSet<>();

		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (t.isConcluida()) {
					tarefaConcluida.add(t);
				}
			}
		} else {
			System.out.println("O conjunto de tarefas esta vazio!");
		}
		return tarefaConcluida;
	}

	// Retorna um Set com as tarefas pendentes.
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> tarefasPendente = new HashSet<>();

		if (!tarefaSet.isEmpty()) {
			for (Tarefa t : tarefaSet) {
				if (!t.isConcluida()) {
					tarefasPendente.add(t);
				}
			}
		} else {
			System.out.println("O conjunto de tarefas esta vazio!");
		}
		return tarefasPendente;
	}

	// Marca uma tarefa como concluída de acordo com a descrição.
	public void marcarTarefaConcluida(String descricao) {
		if (!tarefaSet.isEmpty()) {

			for (Tarefa t : tarefaSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					t.setConcluida(true);
					break;
				}
			}
		} else {
			System.out.println("O conjunto de tarefas esta vazio!");
		}
	}

	// Marca uma tarefa como pendente de acordo com a descrição.
	public void marcarTarefaPendente(String descricao) {
		Tarefa tarefaParaMarcarComoPendente = null;
		if (!tarefaSet.isEmpty()) {

			for (Tarefa t : tarefaSet) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaParaMarcarComoPendente = t;
					break;
				}
			}
			if (tarefaParaMarcarComoPendente != null) {
				if (tarefaParaMarcarComoPendente.isConcluida()) {
					tarefaParaMarcarComoPendente.setConcluida(false);
				}
			} else {
				System.out.println("Tarefa não encontrada na lista.");
			}
		} else {
			System.out.println("O conjunto de tarefas esta vazio!");
		}
	}

	// Remove todas as tarefas da lista de tarefas.
	public void limparListaTarefas() {

		if (!tarefaSet.isEmpty()) {
			tarefaSet.clear();
		} else {
			System.out.println("O conjunto de tarefas esta vazio!");
		}
	}

	public static void main(String[] args) {
		// Criando uma instância da classe ListaTarefas
		ListaTarefas listaTarefas = new ListaTarefas();
		System.out.println("Tamanho da lista de tarefas");
		System.out.println(listaTarefas.contarTarefas());
		System.out.println("----------------------------");
		System.out.println("Adicionando novas tarefas:");
		System.out.println("----------------------------");
		
		// Adicionando tarefas à lista
		listaTarefas.adicionarTarefa("Estudar Java");
		listaTarefas.adicionarTarefa("Fazer exercícios físicos");
		listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
		listaTarefas.adicionarTarefa("Ler livro");
		listaTarefas.adicionarTarefa("Preparar apresentação");

		System.out.println("Exibindo lista de tarefas:");
		System.out.println("----------------------------");
		// Exibindo as tarefas na lista
		listaTarefas.exibirTarefas();

		System.out.println("Removendo uma lista de tarefas:");
		System.out.println("-------------------------------");
		// Removendo uma tarefa
		listaTarefas.removerTarefa("Fazer exercícios físicos");
		System.out.println("Exibindo lista de tarefas:");
		System.out.println("----------------------------");
		listaTarefas.exibirTarefas();

		// Contando o número de tarefas na lista
		System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

		System.out.println("Obter tarefas pendentes:");
		System.out.println("------------------------");
		// Obtendo tarefas pendentes
		System.out.println(listaTarefas.obterTarefasPendentes());

		System.out.println("Marcar tarefas como concluidas:");
		System.out.println("-------------------------------");
		// Marcando tarefas como concluídas
		listaTarefas.marcarTarefaConcluida("Ler livro");
		listaTarefas.marcarTarefaConcluida("Estudar Java");

		System.out.println("Listar tarefas concluidas:");
		System.out.println("--------------------------");
		// Obtendo tarefas concluídas
		System.out.println(listaTarefas.obterTarefasConcluidas());

		System.out.println("Marcar tarefas como pendentes:");
		System.out.println("------------------------------");
		// Marcando tarefas como pendentes
		listaTarefas.marcarTarefaPendente("Estudar Java");
		
		System.out.println("Listar tarefas:");
		System.out.println("---------------");
		listaTarefas.exibirTarefas();

		System.out.println("Limpando lista de  tarefas:");
		System.out.println("---------------------------");
		// Limpando a lista de tarefas
		listaTarefas.limparListaTarefas();
		System.out.println("Exibir lista de tarefas:");
		System.out.println("------------------------");
		listaTarefas.exibirTarefas();

	}
}
