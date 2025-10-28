package pratica;

import java.util.Comparator;

/*Classe que possui atributos como nome, idade e altura.*/
public class PessoaOrdenacao implements Comparable<PessoaOrdenacao>{
	private String nome;
	private int idade;
	private double altura;

	public PessoaOrdenacao(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override
	public int compareTo(PessoaOrdenacao p) {
		return Integer.compare(idade, p.getIdade());
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return "PessoaOrdenacao [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
	}
}

class ComparaPorAltura implements Comparator<PessoaOrdenacao> {

	@Override
	public int compare(PessoaOrdenacao p1, PessoaOrdenacao p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}	
}
