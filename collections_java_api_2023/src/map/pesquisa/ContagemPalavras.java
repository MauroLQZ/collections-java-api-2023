package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

/* Classe que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra 
 * aparece em um texto.*/
public class ContagemPalavras {

	private Map<String, Integer> palavras;

	public ContagemPalavras() {
		this.palavras = new HashMap<>();
	}

	// Adiciona uma palavra à contagem.
	public void adicionarPalavra(String palavra, Integer contagem) {
		palavras.put(palavra, contagem);
	}

	// Remove uma palavra da contagem, se estiver presente.
	public void removerPalavra(String palavra) {
		if (!palavras.isEmpty()) {
			palavras.remove(palavra);
		} else {
			System.out.println("O conjunto de palavras esta vazio!");
		}
	}

	// Exibe todas as palavras e suas respectivas contagens.
	public Integer exibirContagemPalavras() {
		int contagemTotal = 0;
		
		if (!palavras.isEmpty()) {
			for (int contagem : palavras.values()) {
				contagemTotal += contagem;
			}
		} else {
			System.out.println("O conjunto de palavras esta vazio!");
		}
		return contagemTotal;
	}

	// Encontra a palavra mais frequente no texto e retorna a palavra e sua
	// contagem.
	public String encontrarPalavraMaisFrequente() {
		String linguagemMaisFrequente = null;
		int maiorContagem = 0;
		if (!palavras.isEmpty()) {
			for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
				if (entry.getValue() > maiorContagem) {
					maiorContagem = entry.getValue();
					linguagemMaisFrequente = entry.getKey();
				}
			}
		} else {
			System.out.println("O conjunto de palavras esta vazio!");
		}
		return "Palavra Mais Frequente: "+linguagemMaisFrequente+
				" - Quantidade de vezes: "+maiorContagem;
	}

	public void ListarPalavras() {
		if (!palavras.isEmpty()) {
			for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
				System.out.println("Palavra: "+entry.getKey()+" - Contagem: "+entry.getValue());
			}
		} else {
			System.out.println("O conjunto de palavras esta vazio!");
		}
	}

	public static void main(String[] args) {
		ContagemPalavras contagemLinguagens = new ContagemPalavras();
		
		// Adiciona linguagens e suas contagens
		System.out.println("Adicionando Palavras:");
		contagemLinguagens.adicionarPalavra("Java", 2);
		contagemLinguagens.adicionarPalavra("Python", 8);
		contagemLinguagens.adicionarPalavra("JavaScript", 1);
		contagemLinguagens.adicionarPalavra("C#", 6);
		contagemLinguagens.adicionarPalavra("Java1", 2);
		contagemLinguagens.adicionarPalavra("Python1", 8);
		contagemLinguagens.adicionarPalavra("JavaScript1", 1);
		contagemLinguagens.adicionarPalavra("C#1", 6);
		contagemLinguagens.adicionarPalavra("Java2", 2);
		contagemLinguagens.adicionarPalavra("Python2", 8);
		contagemLinguagens.adicionarPalavra("JavaScript2", 1);
		contagemLinguagens.adicionarPalavra("C#2", 6);
		contagemLinguagens.adicionarPalavra("Java3", 2);
		contagemLinguagens.adicionarPalavra("Python3", 8);
		contagemLinguagens.adicionarPalavra("JavaScript3", 1);
		contagemLinguagens.adicionarPalavra("C#3", 6);
		System.out.println("Listando palavras:");
		System.out.println("==================");
		contagemLinguagens.ListarPalavras();
		
		System.out.println("Exibindo a contagem total de linguagens:");
		System.out.println("----------------------------------------");
		// Exibe a contagem total de linguagens
		System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
		System.out.println("Exibindo a linguagem mais frequente:");
		System.out.println("------------------------------------");
		// Encontra e exibe a linguagem mais frequente
		String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
		//System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
		System.out.println(linguagemMaisFrequente);
		System.out.println("Removendo a linguagem Java3:");
		System.out.println("----------------------------");
		contagemLinguagens.removerPalavra("Java3");
		System.out.println("Exibindo a contagem total de linguagens:");
		System.out.println("----------------------------------------");
		System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
		System.out.println("Listando palavras:");
		System.out.println("==================");
		contagemLinguagens.ListarPalavras();
	}

}
