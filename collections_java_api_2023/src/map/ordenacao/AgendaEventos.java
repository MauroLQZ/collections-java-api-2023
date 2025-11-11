package map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Classe que utilize um Map para armazenar as datas e seus respectivos Eventos. 
 * Cada evento é representado por um objeto da classe "Evento", que possui atributos como:
 * nome do evento e o nome da atração. */
public class AgendaEventos {
	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
    //Adiciona um evento à agenda.
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	//Exibe a agenda de eventos em ordem crescente de data.
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
	    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
	      LocalDate dataEvento = entry.getKey();
	      Evento evento = entry.getValue();
	      System.out.println("Data: " + dataEvento + ", Evento: " + evento.getAtracao() + ", Atração: " + evento.getAtracao());
	    }	
	}
	//Retorna o próximo evento que ocorrerá.
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
	    LocalDate proximaData = null;
	    Evento proximoEvento = null;
	    System.out.println("Data de Hoje: "+dataAtual);
	    System.out.println("-------------------------");
	    for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
	      LocalDate dataEvento = entry.getKey();
	      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
	        proximaData = dataEvento;
	        proximoEvento = entry.getValue();
	        break;
	      }
	    }
	    if (proximoEvento != null) {
	      System.out.println("O próximo evento: " + proximoEvento.getAtracao() + 
	    		              " acontecerá na data " + proximaData);
	    } else {
	      System.out.println("Não há eventos futuros na agenda.");
	    }
		
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();

	    // Adiciona eventos à agenda
	    agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
	    agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
	    agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
	    agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
	    agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
	    agendaEventos.adicionarEvento(LocalDate.of(2025, 11, 10), "atualizando Data atual!","10/11/2025");
	    agendaEventos.adicionarEvento(LocalDate.of(2025, 11, 14), "Pericia do INSS!","14/11/2025");
	    // Exibe a agenda completa de eventos
	    agendaEventos.exibirAgenda();

	    // Obtém e exibe o próximo evento na agenda
	    agendaEventos.obterProximoEvento();
	}

}
