package set.ordenacao;

import java.util.Comparator;

/*Cada aluno terá atributos como nome, matrícula e nota.*/
public class Aluno implements Comparable<Aluno>{
	
	private String nome;
	private Long matricula;
	private double media;
	
	public Aluno(String nome, Long matricula, double media) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = media;
	}

	@Override
	public int compareTo(Aluno a) {
		return nome.compareToIgnoreCase(a.getNome());
	}	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	@Override
	public String toString() {
		return "Aluno [nome:"+nome+", matricula:"+matricula+", media:"+media+"]";
	}
}

class CompararPorNota implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a1, Aluno a2) {
		return Double.compare(a1.getMedia(), a2.getMedia());
	}
	
}


