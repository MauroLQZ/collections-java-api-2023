package comparable_comparator;

import java.util.Comparator;

//Classe para comparar Livro por autor
class CompararAutor implements Comparator<Livro> {
@Override
public int compare(Livro l1, Livro l2) {
		return l1.getAutor().compareTo(l2.getAutor());
	}
}
