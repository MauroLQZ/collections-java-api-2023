package comparable_comparator;

import java.util.Comparator;

//Classe para comparar Livro por ano
class CompararAno implements Comparator<Livro> {
@Override
public int compare(Livro l1, Livro l2) {
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
	}
}

