package it.polito.tdp.bar.model;

public class Evento {

	
	private int minuti;
	private EventType tipo;
	private Gruppo gruppo;
	private Tavolo tavolo;
	
	public Evento(int minuti, EventType tipo,Gruppo gruppo) {
		super();
		this.minuti = minuti;
		this.tipo = tipo;
		this.gruppo=gruppo;
	}

	public int getMinuti() {
		return minuti;
	}

	public EventType getTipo() {
		return tipo;
	}

	public Gruppo getGruppo() {
		return gruppo;
	}

	public void setGruppo(Gruppo gruppo) {
		this.gruppo = gruppo;
	}

	public void setMinuti(int minuti) {
		this.minuti = minuti;
	}

	public void setTipo(EventType tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Evento [minuti=" + minuti + ", tipo=" + tipo + "]";
	}

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}
	
	
	
}
