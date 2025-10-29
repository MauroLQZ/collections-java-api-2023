package set.pesquisa;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* Classe que possui um conjunto de objetos do tipo "Contato" como atributo.*/
public class AgendaContatos {
	Set<Contato> contatoSet;
	
	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	//Adiciona um contato à agenda.
	public void adicionarContato(String nome, int numero) {
		this.contatoSet.add(new Contato(nome, numero));
	}
	//Exibe todos os contatos da agenda.
	public void exibirContatos() {

		if(!this.contatoSet.isEmpty()) {
			System.out.println(contatoSet);
		} else {
			System.out.println("O conjunto de contatos esta vazio!");
		}
	}
	public void removerContato(String nome) {
		Contato contatoRemover = null;
		if(!contatoSet.isEmpty()) {
			for(Contato c : contatoSet) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					contatoRemover = c;
					contatoSet.remove(contatoRemover);
					break;
				}
			}
		} else {
			System.out.println("O conjunto de Contatos esta vazio!");
		}//FIM else
	}
	//Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
	public Set<Contato>  pesquisarPorNome(String nome) {

		Set<Contato> contatosPorNome = new HashSet<>();
		if(!contatoSet.isEmpty()) {
			for(Contato c : contatoSet) {
				if(c.getNome().startsWith(nome)) {
					contatosPorNome.add(c);
				}
			}
		} else {
			System.out.println("O conjunto de Contatos esta vazio!");
		}//FIM else
		return contatosPorNome;
	}
	//Atualiza o número de telefone de um contato específico.
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if(!contatoSet.isEmpty()) {
			for(Contato c : contatoSet) {

				if(c.getNome().equalsIgnoreCase(nome)) {
					c.setNumero(novoNumero);
					contatoAtualizado = c;
					System.out.println("O numero do telefone do contato: "+c.getNome()+
							" foi atualizado para o numero: "+c.getNumero());
					break;
				}
			}
			return contatoAtualizado;
		} else {
			throw new RuntimeException("O conjunto está vazio!");
		}//FIM else
	}
	public int totalDeContatos() {
		return contatoSet.size();
	}
    
	public static void main(String[] args) {
		AgendaContatos contatos = new AgendaContatos();
		System.out.println("Quantidade de contatos:");
		System.out.println(contatos.totalDeContatos());
		System.out.println("-----------------------");
		System.out.println("Adicionando contatos:");
		contatos.adicionarContato("Ana Costa", 11111);
		contatos.adicionarContato("Pablo Paul", 22222);
		contatos.adicionarContato("Ana Cury", 33333);
		contatos.adicionarContato("Ana Costa", 11111);
		contatos.adicionarContato("Fernanda Foi", 44444);
		contatos.adicionarContato("Jorge Ouer", 55555);
		contatos.adicionarContato("Pato Pata", 66666);
		contatos.adicionarContato("Ana Costa", 11111);
		contatos.adicionarContato("Vini Viniu", 77777);
		contatos.adicionarContato("Ganso Gol", 88888);
		System.out.println("Quantidade de contatos:");
		System.out.println(contatos.totalDeContatos());
		System.out.println("-----------------------");
		System.out.println("Relação dos contatos:");
		contatos.exibirContatos();
		System.out.println("##############################");
		System.out.println("Atualizando numero do contato:");
		System.out.println(contatos.atualizarNumeroContato("Ana Costa", 99999));
		System.out.println("-----------------------");
		System.out.println("Relação dos contatos:");
		contatos.exibirContatos();
		System.out.println("Pesquisar por nome Ana:");
		System.out.println(contatos.pesquisarPorNome("Ana"));
		System.out.println("==============================");
		System.out.println("Removendo contato Ganso Gol:");
		contatos.removerContato("Ganso Gol");	
		System.out.println("-----------------------");
		System.out.println("Relação dos contatos:");
		contatos.exibirContatos();
	}
}
