package pratica;

/*Cada item possui atributos como nome, preço e quantidade.*/
public class Item {
	
	private String nome;
	private int quantidade;
	private double preco;
	
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getPreco() {
		return preco;
	}
	@Override
	public String toString() {
		return "Item [nome: "+nome+", quantidade: "+quantidade+", preco: "+preco+"]";
	}
	
}
