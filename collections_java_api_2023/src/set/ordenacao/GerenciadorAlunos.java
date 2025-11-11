package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/* Classe que irá lidar com uma lista de alunos.*/
public class GerenciadorAlunos {
	private Set<Aluno> alunoSet;

	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}

	// Adiciona um aluno ao conjunto.
	public void adicionarAluno(String nome, Long matricula, double media) {
		alunoSet.add(new Aluno(nome, matricula, media));
	}

	// Remove um aluno ao conjunto a partir da matricula, se estiver presente.
	public void removerAluno(long matricula) {
		Aluno alunoRemover = null;

		if (!alunoSet.isEmpty()) {
			for (Aluno a : alunoSet) {
				if (a.getMatricula() == matricula) {
					alunoRemover = a;
					System.out.println("O aluno " + a.getNome() + " teve a matricula removida!");
					break;
				}
			}
			alunoSet.remove(alunoRemover);
		} else {
			System.out.println("O conjunto de alunos esta vazio!");
		}
		if (alunoRemover == null) {
			System.out.println("Matricula não encontrada!");
		}
	}

	// Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
	public void exibirAlunosPorNome() {
		Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
		if (!alunoSet.isEmpty()) {
			for(Aluno a : alunoPorNome) {
				//System.out.println("Nome: "+a.getNome()+" - Matricula: "+a.getMatricula()+
					//	            " - Media: "+a.getMedia());
				System.out.println(a.toString());
			}
		} else {
			System.out.println("O conjunto está vazio!");
		}
	}

	// Exibe todos os alunos do conjunto em ordem crescente de nota.
	public void exibirAlunosPorNota() {
		Set<Aluno> alunoPorNota = new TreeSet<>(new CompararPorNota());

		if (!alunoSet.isEmpty()) {
			alunoPorNota.addAll(alunoSet);
			for(Aluno a : alunoPorNota) {
				//System.out.println("Nome: "+a.getNome()+" - Matricula: "+a.getMatricula()+
					//	            " - Media: "+a.getMedia());
				System.out.println(a.toString());
			}	
			
		} else {
			System.out.println("O conjunto está vazio!");
		}
	}

	// Exibe todos os alunos do conjunto.
	public void exibirAlunos() {
		if (!alunoSet.isEmpty()) {
			for(Aluno a : alunoSet) {
				//System.out.println("Nome: "+a.getNome()+" - Matricula: "+a.getMatricula()+
						          //  " - Media: "+a.getMedia());
				System.out.println(a.toString());
			}		
		} else {
			System.out.println("O conjunto Alunos esta vazio!");
		}
	}

	public int totalAlunos() {
		int total = 0;
		if (!alunoSet.isEmpty()) {
			total = alunoSet.size();	
		} else {
			System.out.println("O conjunto Alunos esta vazio!");
		}
		return total;
	}

	public static void main(String[] args) {
		// Criando uma instância do GerenciadorAlunos
	    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
	    System.out.println("Iniciando o cadastro de Alunos:");
	    System.out.println("-------------------------------");
	    System.out.println("Total Alunos: "+gerenciadorAlunos.totalAlunos());
	    System.out.println("---------------------------");

	    System.out.println("Cadastrando Alunos:");
	    System.out.println("-------------------");
	    // Adicionando alunos ao gerenciador
	    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
	    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
	    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
	    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

	    System.out.println("Total Alunos: "+gerenciadorAlunos.totalAlunos());
	    System.out.println("---------------------------");
	    // Exibindo todos os alunos no gerenciador
	    System.out.println("Alunos no gerenciador cadastro atuais:");
	    System.out.println("--------------------------------------");
	    gerenciadorAlunos.exibirAlunos();
	    System.out.println("Removendo Alunos:");
	    System.out.println("-----------------");
	    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
	    gerenciadorAlunos.removerAluno(000L);
	    gerenciadorAlunos.removerAluno(123457L);
	    System.out.println("Alunos depois remocao 123457L:");
	    System.out.println("------------------------------");
	    gerenciadorAlunos.exibirAlunos();
	    System.out.println("Total Alunos: "+gerenciadorAlunos.totalAlunos());
	    System.out.println("---------------------------");
	    System.out.println("Exibir Alunos por nome:");
	    System.out.println("-----------------------");
	    // Exibindo alunos ordenados por nome
	    gerenciadorAlunos.exibirAlunosPorNome();
	    System.out.println("Exibir Alunos por nota:");
	    System.out.println("-----------------------");
	    // Exibindo alunos ordenados por nota
	    gerenciadorAlunos.exibirAlunosPorNota();

	}
}
