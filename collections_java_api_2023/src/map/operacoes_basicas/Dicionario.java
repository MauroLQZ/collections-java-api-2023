package map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

/* Classe que utilize um Map para armazenar palavras e suas respectivas definições.*/
public class Dicionario {
	Map<String, String> dicionarioMap;

	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}

	// Adiciona uma palavra e sua definição ao dicionário, associando a palavra à
	// sua definição correspondente.
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}

	// Remove uma palavra do dicionário, dado o termo a ser removido.
	public void removerPalavra(String palavra) {
		if (!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		} else {
			System.out.println("O dicionário está vazio.");
		}
	}

	// Exibe todas as palavras e suas definições do dicionário, mostrando cada
	// palavra seguida de sua respectiva definição.
	public void exibirPalavras() {
		if (!dicionarioMap.isEmpty()) {
			System.out.println(dicionarioMap);
		} else {
			System.out.println("O dicionário está vazio.");
		}
	}

	// Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
	public String pesquisarPorPalavra(String palavra) {

		if (!dicionarioMap.isEmpty()) {
			String definicao = dicionarioMap.get(palavra);

			if (definicao != null) {
				return definicao;
			} else {
				return "Linguagem não encontrada no dicionário.";
			}
		} else {
			return "O dicionário está vazio.";
		}
	}

	public int totalPalavras() {
		return dicionarioMap.size();
	}

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario();
		System.out.println("Total de palavras: " + dicionario.totalPalavras());
		System.out.println("-------------------------");
		System.out.println("Adicionando palavras ao dicionario:");
		System.out.println("-----------------------------------");
		// Adicionar palavras (linguagens de programação)
		dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
		dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
		dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

		System.out.println("Exibindo palavras do dicionario:");
		System.out.println("--------------------------------");
		// Exibir todas as palavras
		dicionario.exibirPalavras();

		System.out.println("PESQUISANDO palavra java:");
		System.out.println("-------------------------");
		// Pesquisar palavras
		String definicaoJava = dicionario.pesquisarPorPalavra("java");
		System.out.println("Definição da linguagem 'java': " + definicaoJava);

		System.out.println("PESQUISANDO palavra csharp:");
		System.out.println("---------------------------");
		String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
		System.out.println(definicaoCSharp);

		System.out.println("REMOVENDO palavra typescript:");
		System.out.println("-----------------------------");
		// Remover uma palavra
		dicionario.removerPalavra("typescript");
		System.out.println("Exibindo palavras do dicionario:");
		System.out.println("--------------------------------");
		dicionario.exibirPalavras();
	}

}
