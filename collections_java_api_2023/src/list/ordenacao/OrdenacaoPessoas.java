package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* classe que possui uma lista de objetos do tipo "Pessoa" como atributo */
public class OrdenacaoPessoas {
	List<Pessoa> listPessoa;
	
	public OrdenacaoPessoas() {
		this.listPessoa = new ArrayList<>();
	}
	//Adiciona uma pessoa à lista.
	public void adicionarPessoa(String nome, int idade, double altura) {
		this.listPessoa.add(new Pessoa(nome, idade, altura));
	}
	//Ordena as pessoas da lista por idade usando a interface Comparable.
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoaPorIdade = new ArrayList<>(listPessoa);
		if(!listPessoa.isEmpty()) {
			Collections.sort(pessoaPorIdade);
			return pessoaPorIdade;
		} else {
			throw new RuntimeException("A Lista esta vazia!");
		}		
	}
	//Ordena as pessoas da lista por altura usando um Comparator personalizado.
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<>(listPessoa);
		if(!listPessoa.isEmpty()) {
			Collections.sort(pessoaPorAltura, new CompararPorAltura() );
			return pessoaPorAltura;
		} else {
			throw new RuntimeException("A Lista esta vazia!");
		}	
	}
	public static void main(String[] args) {
		// Criando uma instância da classe OrdenacaoPessoas
	    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

	    // Adicionando pessoas à lista
	    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
	    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
	    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
	    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

	    // Exibindo a lista de pessoas adicionadas
	    System.out.println(ordenacaoPessoas.listPessoa);

	    // Ordenando e exibindo por idade
	    System.out.println(ordenacaoPessoas.ordenarPorIdade());

	    // Ordenando e exibindo por altura
	    System.out.println(ordenacaoPessoas.ordenarPorAltura());

	}
}
