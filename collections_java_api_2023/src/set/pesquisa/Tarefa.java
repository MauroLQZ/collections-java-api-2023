package set.pesquisa;

/* Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi 
 * concluída ou não*/
public class Tarefa {
	private String descricao;
	private boolean concluida;

	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = false;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}
	@Override
	public String toString() {
		return "Tarefa [descricao: "+descricao+", concluida: "+concluida+"]";
	}
}
