package list.OperacoesBasicas;

public class Tarefa {
	
	//atributo
	private String descricao;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	@Override
	  public String toString() {
	    return  "Tarefa{"+
		"Descricao: "+descricao+"\'"+
		"}";
	  }
	//ou só a descricao
	/* @Override
	  public String toString() {
	    return  descricao;
	  }*/
}
