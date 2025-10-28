package list.pesquisa;

import java.util.Comparator;

//Uma classe 'Livro' que implementa Comparable
class Livro implements Comparable<Livro> {
	private String titulo;
	private String autor;
	private int anoPublicacao;

	// Construtor
	public Livro(String ti, String au, int anoP) {
		this.titulo = ti;
		this.autor = au;
		this.anoPublicacao = anoP;
	}

	// Usado para ordenar livros por ano
	public int compareTo(Livro l) {
		return titulo.compareTo(l.titulo);
	}

	// Métodos getters para acessar os dados privados
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}
}

//Classe para comparar Livro por autor
class CompararAutor implements Comparator<Livro> {
@Override
public int compare(Livro l1, Livro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}
}

//Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro> {
@Override
public int compare(Livro l1, Livro l2) {
		if (l1.getAnoPublicacao() < l2.getAnoPublicacao())
			return -1;
		if (l1.getAnoPublicacao() > l2.getAnoPublicacao())
			return 1;
		else
			return 0;
	}
}

class CompararAnoAutorTitulo implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		int ano = Integer.compare(l1.getAnoPublicacao(), l2.getAnoPublicacao());
		if (ano != 0)
			return ano;
		int autor = l1.getAutor().compareTo(l2.getAutor());
		if (autor != 0)
			return autor;
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}
