package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

/* Classe que possui uma lista de números inteiros como atributo. */
public class SomaNumeros {
	List<Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}

	// Adiciona um número à lista de números
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);
	}

	// Calcula a soma de todos os números na lista e retorna o resultado.
	public int calcularSoma() {
		int soma = 0;
		if (!this.numeros.isEmpty()) {
			for (Integer n : this.numeros)
				soma += n;
		}
		return soma;
	}

	// Encontra o maior número na lista e retorna o valor.
	public int encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;

		if (!numeros.isEmpty()) {
			for (Integer n : numeros) {
				if (n >= maiorNumero)
					maiorNumero = n;
			}
			return maiorNumero;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}

	// Encontra o menor número na lista e retorna o valor.
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		
		if (!numeros.isEmpty()) {
			for(Integer n : numeros) {
				if(n <= menorNumero)
					menorNumero = n;
			}
			return menorNumero;
		} else {
			throw new RuntimeException("A lista está vazia!");
		}

	}

	// Retorna uma lista contendo todos os números presentes na lista.
	public void exibirNumeros() {
		if (!numeros.isEmpty()) {
			//System.out.println(this.numeros);
			for(Integer n : numeros) 
				System.out.print("-"+n); 
		} else {
		      System.out.println("A lista está vazia!");
	    }
	}

	public static void main(String[] args) {
		SomaNumeros soma = new SomaNumeros();
		soma.adicionarNumero(5);
		soma.adicionarNumero(7);
		soma.adicionarNumero(15);
		soma.adicionarNumero(25);
		soma.adicionarNumero(3);
		soma.adicionarNumero(9);
		soma.adicionarNumero(12);
		soma.adicionarNumero(8);
		soma.adicionarNumero(11);
		soma.adicionarNumero(10);
		
		soma.exibirNumeros();
		System.out.println("\nSoma dos Numeros: "+soma.calcularSoma());
		System.out.println("MAIOR Numero: "+soma.encontrarMaiorNumero());
		System.out.println("MENOR Numero: "+soma.encontrarMenorNumero());

	}

}
