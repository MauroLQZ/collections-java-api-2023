package pratica.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* Classe que possui um conjunto de objetos do tipo "Produto" como atributo.*/
public class CadastroDeProdutos {
	Set<Produto> produtoSet;

	public CadastroDeProdutos() {
		this.produtoSet = new HashSet<>();
	}
    //Adiciona um produto ao cadastro.
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}
	//Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}

	//Exibe todos os produtos do cadastro em ordem crescente de preço.
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new CompararPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}
	public int totalDeProdutos() {
		return produtoSet.size();
	}
		
	public static void main(String[] args) {
		CadastroDeProdutos cadastro = new CadastroDeProdutos();
		System.out.println("Total Produtos:");
		System.out.println("---------------");
		System.out.println(cadastro.totalDeProdutos());
		System.out.println("Adicionando Produtos:");
		System.out.println("---------------------");
		cadastro.adicionarProduto(1L, "TV", 50d, 10);
		cadastro.adicionarProduto(2L, "Video", 20d, 10);
		cadastro.adicionarProduto(3L, "VHS", 30d, 10);
		cadastro.adicionarProduto(1L, "TV", 50d, 10);
		cadastro.adicionarProduto(5L, "Geladeira", 100d, 10);
		cadastro.adicionarProduto(1L, "TV", 50d, 10);
		cadastro.adicionarProduto(4L, "DVD", 40d, 10);
		cadastro.adicionarProduto(5L, "Mesa", 30d, 10);
		cadastro.adicionarProduto(7L, "Fogao", 60d, 10);
		cadastro.adicionarProduto(3L, "Micro", 450d, 10);
		cadastro.adicionarProduto(4L, "Cadeira", 15d, 10);
		System.out.println("Total Produtos:");
		System.out.println("---------------");
		System.out.println(cadastro.totalDeProdutos());
		System.out.println(cadastro.produtoSet);
		System.out.println("Exibindo Produtos por Nome:");
		System.out.println("---------------------------");
		System.out.println(cadastro.exibirProdutosPorNome());
		System.out.println("Exibindo Produtos por Preco:");
		System.out.println("---------------------------");
		System.out.println(cadastro.exibirProdutosPorPreco());
		
	
	}
}
