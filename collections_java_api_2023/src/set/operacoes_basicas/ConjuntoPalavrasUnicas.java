package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

/* Classe que possui um conjunto de palavras únicas como atributo.*/
public class ConjuntoPalavrasUnicas {
	Set<String> conjuntoPalavras;

	public ConjuntoPalavrasUnicas() {
		this.conjuntoPalavras = new HashSet<>();
	}
	//Adiciona uma palavra ao conjunto.
	public void adicionarPalavra(String palavra) {
		this.conjuntoPalavras.add(palavra);
	}
	//Remove uma palavra do conjunto.
	public void removerPalavra(String palavra) {
	    if (!conjuntoPalavras.isEmpty()) {
	      if (conjuntoPalavras.contains(palavra)) {
	    	  conjuntoPalavras.remove(palavra);
	      } else {
	        System.out.println("Palavra não encontrada no conjunto!");
	      }
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	  }
	//Verifica se uma palavra está presente no conjunto.
	public boolean verificarPalavra(String palavra) {
	    return conjuntoPalavras.contains(palavra);
	  }
	//Exibe todas as palavras únicas do conjunto.
	public void exibirPalavrasUnicas() {
	    if(!conjuntoPalavras.isEmpty()) {
	      System.out.println(conjuntoPalavras);
	    } else {
	      System.out.println("O conjunto está vazio!");
	    }
	  }
	
	public int totalPalavras() {
		return conjuntoPalavras.size();
	}
	
	public static void main(String[] args) {
		// Criando uma instância da classe ConjuntoPalavrasUnicas
	    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

	    // Adicionando linguagens únicas ao conjunto
	    conjuntoLinguagens.adicionarPalavra("Java");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("JavaScript");
	    conjuntoLinguagens.adicionarPalavra("Python");
	    conjuntoLinguagens.adicionarPalavra("C++");
	    conjuntoLinguagens.adicionarPalavra("Ruby");

	    // Exibindo as linguagens únicas no conjunto
	    conjuntoLinguagens.exibirPalavrasUnicas();
	    System.out.println("Total Palavras: "+conjuntoLinguagens.totalPalavras());

	    // Removendo uma linguagem do conjunto
	    conjuntoLinguagens.removerPalavra("Python");
	    conjuntoLinguagens.exibirPalavrasUnicas();
	    System.out.println("Total Palavras: "+conjuntoLinguagens.totalPalavras());
	    
	    // Removendo uma linguagem inexistente
	    conjuntoLinguagens.removerPalavra("Swift");

	    // Verificando se uma linguagem está no conjunto
	    System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
	    System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

	    // Exibindo as linguagens únicas atualizadas no conjunto
	    conjuntoLinguagens.exibirPalavrasUnicas();
	    System.out.println("Total Palavras: "+conjuntoLinguagens.totalPalavras());
	}

}
