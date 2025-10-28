package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;
	
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}

	// Adiciona um convidado ao conjunto.
	public void adicionarConvidado(String nome, int codigoConvite) {
		this.convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	// Remove um convidado do conjunto com base no código do convite.
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;

		if (!(this.convidadoSet == null)) {

			for (Convidado c : convidadoSet) {

				if (c.getCodigoConvite() == codigoConvite) {
					convidadoParaRemover = c;
					this.convidadoSet.remove(convidadoParaRemover);
					break;
				}
			}
		} else {
			System.out.println("Conjunto de Convidados esta vazio!");
		}
	}

	// Conta o número total de convidados no Set.
	public int contarConvidados() {
		return this.convidadoSet.size();
	}

	// Exibe todos os convidados do conjunto.
	public void exibirConvidados() {
		
		for(Convidado c : convidadoSet) {
			System.out.println("{"+c.getNome()+"-"+c.getCodigoConvite()+"}");
		}
	}

	public static void main(String[] args) {
		ConjuntoConvidados convidado = new ConjuntoConvidados();
		System.out.println("Quantidade de convidados:");
		System.out.println(convidado.contarConvidados());
		System.out.println("Adicionando convidados: ");
		
		convidado.adicionarConvidado("Janja", 123456789);
		convidado.adicionarConvidado("Tuta", 141414253);
		convidado.adicionarConvidado("Pato", 63524163);
		convidado.adicionarConvidado("Cisne", 369369369);
		convidado.adicionarConvidado("Capivara", 987654321);
		convidado.adicionarConvidado("Jorge", 123456789);
		convidado.adicionarConvidado("Copa", 123456789);
		convidado.adicionarConvidado("Palavio", 741852963);
		convidado.adicionarConvidado("Juca", 52634136);
		convidado.adicionarConvidado("Gregre", 123456789);
		convidado.adicionarConvidado("Bretu", 22222222);
		System.out.println("-------------------------");
		System.out.println("Quantidade de convidados:");
		System.out.println(convidado.contarConvidados());
		System.out.println("Lista de Convidados:");
		System.out.println("--------------------");
		convidado.exibirConvidados();
		System.out.println("Quantidade de convidados:");
		System.out.println(convidado.contarConvidados());
		System.out.println("-------------------------");
		System.out.println("Removendo um convidado codigo: 123456789");
		convidado.removerConvidadoPorCodigoConvite(123456789);
		System.out.println("***********************************");
		System.out.println("Lista de Convidados:");
		System.out.println("--------------------");
		convidado.exibirConvidados();
		System.out.println("------------------------------------");
		System.out.println("Quantidade de convidados:");
		System.out.println(convidado.contarConvidados());
	}
}
