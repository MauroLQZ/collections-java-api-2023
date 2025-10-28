package pratica;

import java.util.ArrayList;
import java.util.List;

/*classe que possui uma lista de objetos do tipo "Livro" como atributo*/
public class CatalogoLivros {
	List<Livro> listLivro;
	
	public CatalogoLivros() {
		this.listLivro = new ArrayList<>();
	}
    //Adiciona um livro ao catálogo.
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		this.listLivro.add(new Livro(titulo, autor, anoPublicacao));
	}
	//Pesquisa livros por autor e retorna uma lista com os livros encontrados.
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livroPorAutor = new ArrayList<>();
		if(!this.listLivro.isEmpty()) {
			for(Livro l : listLivro) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(l);
				}
			}
		}
		return livroPorAutor;
	}
	//Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros 
	// encontrados.
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livroPorIntervalo = new ArrayList<>();
		if(!this.listLivro.isEmpty()) {
			for(Livro l : listLivro) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livroPorIntervalo.add(l);
				}
			}
		}
		return livroPorIntervalo;
	}
	//Pesquisa livros por título e retorna o primeiro livro encontrado.
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!this.listLivro.isEmpty()) {
			for(Livro l : listLivro) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}

	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		// Adicionando livros ao catálogo
	    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
	    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
	    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
	    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

	    // Exibindo livros pelo mesmo autor
	    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

	    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
	    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

	    // Exibindo livros dentro de um intervalo de anos
	    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

	    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
	    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

	    // Exibindo livros por título
	    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

	    // Exibindo livros por título (caso em que não há livros com o título especificado)
	    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
		
	}
}
