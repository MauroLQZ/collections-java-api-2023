package list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

/** Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. 
  * O carrinho deve ser implementado como uma lista de itens.*/
public class CarrinhoDeCompras {
	
	List<Item> listaItem;
	
	public CarrinhoDeCompras() {
		this.listaItem = new ArrayList<>();
	}
	
	// Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaItem.add(new Item(nome, preco, quantidade));
	}
	//Remove um item do carrinho com base no seu nome.
	public void removerItem(String nome) {
		List<Item> removeItem = new ArrayList<>();
		for(Item item : listaItem) {
			if(item.getNome().equalsIgnoreCase(nome)) {
				removeItem.add(item);
			}
		}
		listaItem.removeAll(removeItem);
	}
	
	//Calcula/Retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
	public double calcularValorTotal() {
		double valorTotal = 0;
		for (Item item : listaItem) {
			valorTotal += item.getPreco() * item.getQuantidade();
		}			
		return valorTotal;
	}
	
	// Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
	public void exibirItens() {
		for(Item item : listaItem) {
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		System.out.println("Valor total dos items:");
		System.out.println("---------------------------");
		System.out.println(carrinho.calcularValorTotal());
		System.out.println("ADD items ao Carrinho:");
		System.out.println("----------------------");
		//String nome, double preco, int quantidade
		carrinho.adicionarItem("Sabao", 12.4, 10);
		carrinho.adicionarItem("Alho", 1.5, 10);
		carrinho.adicionarItem("Couve", 1.30, 10);
		carrinho.adicionarItem("Alface", 1.20, 10);
		carrinho.adicionarItem("Sabao", 12.4, 10);
		carrinho.adicionarItem("Refri", 7.8, 10);
		carrinho.adicionarItem("Sabao", 12.4, 10);
		carrinho.adicionarItem("Tomate", 3.50, 10);
		carrinho.adicionarItem("Banana", 3.8, 10);
		carrinho.adicionarItem("Sabao", 12.4, 10);
		carrinho.adicionarItem("Cebola", 3.5, 10);
		
		System.out.println("\nValor total dos items:");
		System.out.println("---------------------------");
		System.out.println(carrinho.calcularValorTotal());
		
		System.out.println("\nLista de items:");
		System.out.println("-----------------");
		carrinho.exibirItens();
		
		System.out.println("\nRemovendo item Sabao do Carrinho:");
		System.out.println("-----------------------------------");
		carrinho.removerItem("Sabao");
		
		System.out.println("Valor total dos items:");
		System.out.println("-----------------------");
		System.out.println(carrinho.calcularValorTotal());
		
		System.out.println("\nLista de items:");
		System.out.println("-----------------");
		carrinho.exibirItens();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
