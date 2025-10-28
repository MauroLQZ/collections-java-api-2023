package pratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Classe que possui uma lista de objetos do tipo "Pessoa" como atributo.*/
public class OrdenacaoPessoas {
	List<PessoaOrdenacao> listPessoa;
	
	public OrdenacaoPessoas() {
		this.listPessoa = new ArrayList<>();
	}
	//Adiciona uma pessoa à lista.
	public void  adicionarPessoa(String nome, int idade, double altura) {
		listPessoa.add(new PessoaOrdenacao(nome, idade, altura));
	}
	public int totalPessoas () {
		return listPessoa.size();
	}
	//Lista de Pessoas
	public void listaDePessoas() {
			
			if(!listPessoa.isEmpty()) {
				for(PessoaOrdenacao p : listPessoa)
					System.out.println(""+p);
			} else {
				//throw new RuntimeException("A lista está vazia!");
				System.out.println("A Lista esta Vazia!");
			}
		}
	//Ordena as pessoas da lista por idade usando a interface Comparable.
	public List<PessoaOrdenacao> ordenarPorIdade() {
		List<PessoaOrdenacao> ordenaIdade = new ArrayList<>(listPessoa);
		
		if(!listPessoa.isEmpty()) {
			Collections.sort(ordenaIdade);
			return ordenaIdade;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	//Ordena as pessoas da lista por altura usando um Comparator personalizado.
	public List<PessoaOrdenacao> ordenarPorAltura() {

		List<PessoaOrdenacao> ordenaAltura = new ArrayList<>(listPessoa);
		if(!listPessoa.isEmpty()) {
			Collections.sort(ordenaAltura, new ComparaPorAltura());
			return ordenaAltura;
		} else {
			throw new RuntimeException("A lista esta vazia!");
		}
		
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoas ordenaP = new OrdenacaoPessoas();
		System.out.println("Total Pessoas: "+ordenaP.totalPessoas());
		System.out.println("Lista Pessoas:");
		ordenaP.listaDePessoas();
		System.out.println("Adicionando Pessoas: ");
		ordenaP.adicionarPessoa("Joao", 21, 1.56);
		ordenaP.adicionarPessoa("Pedro", 27, 1.86);
		ordenaP.adicionarPessoa("Ana", 72, 1.66);
		ordenaP.adicionarPessoa("Pepe", 18, 1.76);
		ordenaP.adicionarPessoa("Kaka", 25, 1.62);
		ordenaP.adicionarPessoa("Juju", 10, 1.96);
		ordenaP.adicionarPessoa("PiuPiu", 65, 2.00);
		ordenaP.adicionarPessoa("Gugu", 25, 1.76);
		ordenaP.adicionarPessoa("Lady", 36, 1.72);
		ordenaP.adicionarPessoa("Biude", 46, 1.62);
		ordenaP.adicionarPessoa("Foriu", 27, 1.89);
		System.out.println("Total Pessoas: "+ordenaP.totalPessoas());
		System.out.println("Lista Pessoas:");
		ordenaP.listaDePessoas();
		System.out.println("Ordernar por Idade:");
		System.out.println(ordenaP.ordenarPorIdade());
		System.out.println("Ordernar por Altura:");
		System.out.println(ordenaP.ordenarPorAltura());
	}

}
