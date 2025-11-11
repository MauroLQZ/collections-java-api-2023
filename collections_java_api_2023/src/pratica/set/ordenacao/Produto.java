package pratica.set.ordenacao;

import java.util.Comparator;

/*Cada produto possui atributos como nome, cod, preço e quantidade.*/
public class Produto implements Comparable<Produto>{
	
	private long codigo;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(long codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	@Override
	public int compareTo(Produto p) {
		return nome.compareToIgnoreCase(p.getNome());
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Produto [codigo:"+codigo+", nome:"+nome+", preco:"+preco+", quantidade:"+quantidade+"]";
	}
}

class CompararPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}

