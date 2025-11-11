package map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

/* Classe que utilize um Map para armazenar os contatos. 
 * Cada contato possui um nome como chave e um número de telefone como valor.*/
public class AgendaContatos {
	private Map<String, Integer> agendaContatosMap;

	public AgendaContatos() {
		this.agendaContatosMap = new HashMap<>();
	}
    //Adiciona um contato à agenda, associando o nome do contato ao número de telefone correspondente.
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatosMap.put(nome, telefone);
	}
	//Remove um contato da agenda, dado o nome do contato.
	public void removerContato(String nome) {
		if(!agendaContatosMap.isEmpty()) {
			agendaContatosMap.remove(nome);
		} else {
			System.out.println("Agenda de Contatos vazia!");
		}
		
	}
    //Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.
	public void exibirContatos() {
		if(!agendaContatosMap.isEmpty()) {
			System.out.println(agendaContatosMap);
		} else {
			System.out.println("Agenda de Contatos vazia!");
		}
		
	}
	//Pesquisa um contato pelo nome e retorna o número de telefone correspondente.
	public Integer  pesquisarPorNome(String nome) {
		Integer numeroTelefone = 0;
		if(!agendaContatosMap.isEmpty()) {
			numeroTelefone = agendaContatosMap.get(nome);
		} else {
			System.out.println("Agenda de Contatos vazia!");
		}
		return numeroTelefone;
	}
	public int totalContatos() {
		return agendaContatosMap.size();
	}
	
	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		System.out.println("Total de Contatos:");
		System.out.println(agenda.totalContatos());
		System.out.println("------------------");
		System.out.println("Adicionando Contatos:");
		System.out.println("---------------------");
		agenda.adicionarContato("Camila", 123456);
	    agenda.adicionarContato("João", 5665);
	    agenda.adicionarContato("Carlos", 1111111);
	    agenda.adicionarContato("Ana", 654987);
	    agenda.adicionarContato("Maria", 1111111);
	    agenda.adicionarContato("Camila", 44444);
	    System.out.println("Total de Contatos:");
		System.out.println(agenda.totalContatos());
		System.out.println("------------------");
		agenda.exibirContatos();
		// Remover um contato
	    agenda.removerContato("Maria");
	    System.out.println("Excluindo o contato Maria:");
	    System.out.println("------------------");
	    agenda.exibirContatos();

	    System.out.println("Pesquisando contato Joao:");
	    System.out.println("-------------------------");
	    // Pesquisar número por nome
	    String nomePesquisa = "João";
	    Integer numeroPesquisa = agenda.pesquisarPorNome("João");
	    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

	    System.out.println("Pesquisando contato nao existe Paula:");
	    System.out.println("-------------------------------------");
	    String nomePesquisaNaoExistente = "Paula";
	    Integer numeroPesquisaNaoExistente = agenda.pesquisarPorNome(nomePesquisaNaoExistente);
	    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
	}
}
