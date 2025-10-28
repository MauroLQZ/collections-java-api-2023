package pratica;

import java.util.ArrayList;
import java.util.List;

/* Classe que representa um carrinho de compras online. 
 * O carrinho deve ser implementado como uma lista de itens.*/
public class CarrinhoDeCompras {
	
	private List<Item> carrinhoList;

	public CarrinhoDeCompras() {
		this.carrinhoList = new ArrayList<>();
	}
	//Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
	public void adicionarItem(String nome, double preco, int quantidade) {
		this.carrinhoList.add(new Item(nome, preco, quantidade));
	}
	//Remove um item do carrinho com base no seu nome.
	public void removerItem(String nome) {
		List<Item> removeList = new ArrayList<>();
		if(this.carrinhoList == null)
			return;
		for(Item item : carrinhoList) {
			if(item.getNome().equalsIgnoreCase(nome))
				removeList.add(item);
		}
		carrinhoList.removeAll(removeList);
	}
	//Calcula Quantidade de items do carrinho.
		public double calcularQuantidadeItems() {
			int total = 0;
			for(Item item : carrinhoList) {
				total += item.getQuantidade();
			}
			return total;
		}
	//Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
	public double calcularValorTotal() {
		double soma = 0;
		for(Item item : carrinhoList) {
			soma += item.getPreco() * item.getQuantidade();
		}
		return soma;
	}
	//Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
	public void exibirItens() {
		for(Item item : carrinhoList) {
			System.out.println("Nome: "+item.getNome() +
					           " - Preço: "+item.getPreco() +
					           " - Quantidade: "+item.getQuantidade());
		}
	}
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		System.out.println("Quantidade/Valor toral da Lista do Carrinho de compras:");
		System.out.println("-------------------------------------------------------");
		System.out.println(carrinho.calcularQuantidadeItems());
		System.out.println(carrinho.calcularValorTotal());
		System.out.println("Adicionando items ao carrinho de compras:");
		System.out.println("-----------------------------------------");
		carrinho.adicionarItem("Jaqueta", 100, 10);
		carrinho.adicionarItem("Calça", 100, 10);
		carrinho.adicionarItem("Jaqueta", 100, 10);
		carrinho.adicionarItem("Short", 100, 10);
		carrinho.adicionarItem("Jaqueta", 100, 10);
		carrinho.adicionarItem("Saia", 100, 10);
		carrinho.adicionarItem("Jaqueta", 100, 10);
		carrinho.adicionarItem("Camisa", 100, 10);
		carrinho.adicionarItem("Jaqueta", 100, 10);
		carrinho.adicionarItem("Blusa", 100, 10);
		
		System.out.println("Quantidade/Valor toral da Lista do Carrinho de compras:");
		System.out.println("-------------------------------------------------------");
		System.out.println(carrinho.calcularQuantidadeItems());
		System.out.println(carrinho.calcularValorTotal());
		System.out.println("Removendo item do Carrinho de compras:");
		System.out.println("--------------------------------------");
		carrinho.removerItem("Jaqueta");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Quantidade/Valor toral da Lista do Carrinho de compras:");
		System.out.println("-------------------------------------------------------");
		System.out.println(carrinho.calcularQuantidadeItems());
		System.out.println(carrinho.calcularValorTotal());
	}
}
