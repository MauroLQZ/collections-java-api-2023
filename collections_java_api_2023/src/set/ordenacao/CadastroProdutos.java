package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* classe que possui um conjunto de objetos do tipo "Produto" como atributo.*/
public class CadastroProdutos {

	Set<Produto> produtoSet;
	
	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	//Adiciona um produto ao cadastro.
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		this.produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}
	//Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	//Exibe todos os produtos do cadastro em ordem crescente de preço.
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtoPorPreco = new TreeSet<>(new CompararPorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}

	public static void main(String[] args) {
		// Criando uma instância do CadastroProdutos
	    CadastroProdutos cadastroProdutos = new CadastroProdutos();

	    System.out.println("Adicionando Produtos:");
	    
	    // Adicionando produtos ao cadastro
	    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
	    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
	    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
	    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
	    System.out.println("Exibindo Produtos:");
	    System.out.println("------------------");
	    // Exibindo todos os produtos no cadastro
	    System.out.println(cadastroProdutos.produtoSet);
	    System.out.println("Exibindo Produtos Por Nome:");
	    System.out.println("---------------------------");
	    // Exibindo produtos ordenados por nome
	    System.out.println(cadastroProdutos.exibirProdutosPorNome());
	    System.out.println("Exibindo Produtos Por Preco:");
	    System.out.println("----------------------------");
	    // Exibindo produtos ordenados por preço
	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
		
	}
}
