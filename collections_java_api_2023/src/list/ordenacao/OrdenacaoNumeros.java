package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Crie classe "OrdenacaoNumeros" que possui uma lista de números inteiros como 
 * atributo. Implemente os seguintes métodos:    */
public class OrdenacaoNumeros {
	List<Integer> numeros;

	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}

	// Adiciona um número à lista.
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}

	// Ordena os números da lista em ordem ascendente usando a interface Comparable
	// e a class
	// Collections.
	public List<Integer> ordenarAscendente() {
		List<Integer> numerosAscendente = new ArrayList<>(this.numeros);

		if (!this.numeros.isEmpty()) {
			Collections.sort(numerosAscendente);
			return numerosAscendente;
		} else {
			throw new RuntimeException("A lista esta vazia!");
		}
	}

	// Ordena os números da lista em ordem descendente usando um Comparable class
	// Collections.
	public List<Integer> ordenarDescendente() {
		List<Integer> numerosDescendente = new ArrayList<>(this.numeros);

		if (!this.numeros.isEmpty()) {
			// Collections.reverse(numerosDescendente);
			numerosDescendente.sort(Collections.reverseOrder());
			return numerosDescendente;
		} else {
			throw new RuntimeException("A lista esta vazia!");
		}
	}

	public void exibirNumeros() {
		if (!this.numeros.isEmpty()) {
			for (Integer n : this.numeros) {
				System.out.print(n + "-");
			}
		} else {
			throw new RuntimeException("A lista esta vazia!");
		}
	}

	public void totalNumeros() {
		if (!this.numeros.isEmpty()) {
			System.out.print("Total de numeros: " + this.numeros.size());
		} else {
			throw new RuntimeException("A lista esta vazia!");
		}
	}

	public static void main(String[] args) {
		// Criando uma instância da classe OrdenacaoNumeros
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();

		// Adicionando números à lista
		numeros.adicionarNumero(2);
		numeros.adicionarNumero(5);
		numeros.adicionarNumero(4);
		numeros.adicionarNumero(1);
		numeros.adicionarNumero(99);

		System.out.println("\nExibindo numeros: ");
		// Exibindo a lista de números adicionados
		numeros.exibirNumeros();
        System.out.println();
		numeros.totalNumeros();
		System.out.println("\nOrdem ascendente de  numeros: ");
		// Ordenando e exibindo em ordem ascendente
		System.out.println(numeros.ordenarAscendente());
		System.out.println("\nExibindo numeros: ");
		// Exibindo a lista
		numeros.exibirNumeros();

		System.out.println("\nOrdem descendente de  numeros: ");
		// Ordenando e exibindo em ordem descendente
		System.out.println(numeros.ordenarDescendente());
		System.out.println("\nExibindo numeros: ");
		// Exibindo a lista
		numeros.exibirNumeros();
	}
}
