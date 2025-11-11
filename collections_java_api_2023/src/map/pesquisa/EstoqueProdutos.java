package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

/* Classe utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos
 * preços. Cada produto possui um código como chave e um objeto Produto*/
public class EstoqueProdutos {
	private Map<Long, Produto> estoqueProdutosMap;

	public EstoqueProdutos() {
		this.estoqueProdutosMap = new HashMap<>();
	}

	// Adiciona um produto ao estoque, juntamente com a quantidade disponível e o
	// preço.
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
	}

	// Exibe todos os produtos, suas quantidades em estoque e preços.
	public void exibirProdutos() {
		if (!estoqueProdutosMap.isEmpty()) {
			System.out.println(estoqueProdutosMap);
		} else {
			System.out.println("O estoque esta vazio!");
		}

	}

	// Calcula e retorna o valor total do estoque, considerando a quantidade e o
	// preço de cada produto.
	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				valorTotalEstoque += p.getPreco() * p.getQuantidade();
			}
		} else {
			System.out.println("O estoque esta vazio!");
		}
		return valorTotalEstoque;
	}

	// Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
	public Produto obterProdutoMaisCaro() {
		Produto produtoMaisCaro = null;

		double valorMaisCaro = Double.MIN_VALUE;
		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() > valorMaisCaro) {
					valorMaisCaro = p.getPreco();
					produtoMaisCaro = p;
				}
			}
		} else {
			System.out.println("O estoque esta vazio!");
		}
		return produtoMaisCaro;

	}

	// Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double valorMaisBarato = Double.MAX_VALUE;

		if (!estoqueProdutosMap.isEmpty()) {
			for (Produto p : estoqueProdutosMap.values()) {
				if (p.getPreco() < valorMaisBarato) {
					valorMaisBarato = p.getPreco();
					produtoMaisBarato = p;
				}
			}
		} else {
			System.out.println("O estoque esta vazio!");
		}
		return produtoMaisBarato;

	}

	// Retorna o produto que está em maior quantidade no estoque, considerando o
	// valor total de cada
	// produto (quantidade * preço)
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorNoEstoque = null;
		double maiorValorTotalProdutoEstoque = 0d;
		
		if (!estoqueProdutosMap.isEmpty()) {
			for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
				double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
				if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
					maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
					produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
				}
			}
		} else {
			System.out.println("O estoque esta vazio!");
		}
		return produtoMaiorQuantidadeValorNoEstoque;
	}
	
	public int totalProdutos() {
		return estoqueProdutosMap.size();
	}

	public static void main(String[] args) {
		EstoqueProdutos estoque = new EstoqueProdutos();

		System.out.println("Quantidade de Produtos: "+estoque.totalProdutos());
		System.out.println("Exibir Produtos:");
		System.out.println("----------------");
	    // Exibe o estoque vazio
	    estoque.exibirProdutos();

	    System.out.println("Adicionando Produtos:");
		System.out.println("---------------------");
	    // Adiciona produtos ao estoque
	    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
	    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
	    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
	    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

	    System.out.println("Exibir Produtos:");
		System.out.println("----------------");
	    // Exibe os produtos no estoque
	    estoque.exibirProdutos();
	    System.out.println("-------------------------");
	    System.out.println("Quantidade de Produtos: "+estoque.totalProdutos());

	    // Calcula e exibe o valor total do estoque
	    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

	    // Obtém e exibe o produto mais caro
	    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
	    System.out.println("Produto mais caro: " + produtoMaisCaro);

	    // Obtém e exibe o produto mais barato
	    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
	    System.out.println("Produto mais barato: " + produtoMaisBarato);

	    // Obtém e exibe o produto com a maior quantidade em valor no estoque
	    Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
	    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);

	}

}
