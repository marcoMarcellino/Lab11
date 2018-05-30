package it.polito.tdp.bar;



public class Evento {

	
	private int minuti;
	private EventType tipo;
	
	Simulazione simulatore;
	
	public Evento(int minuti, EventType tipo) {
		super();
		this.minuti = minuti;
		this.tipo = tipo;
	}

	public int getMinuti() {
		return minuti;
	}

	public EventType getTipo() {
		return tipo;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + minuti;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (minuti != other.minuti)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Evento [minuti=" + minuti + ", tipo=" + tipo + "]";
	}
	
	private Simulazione getOuterType() {
		return this.simulatore;
	}
	
	
}
