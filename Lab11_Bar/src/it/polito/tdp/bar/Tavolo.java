package it.polito.tdp.bar;


public class Tavolo {

	private int idTavolo;
	private int numeroPers;
	private boolean occupato;
	
	
	public Tavolo(int idTavolo, int numeroPers, boolean occupato) {
		super();
		this.idTavolo = idTavolo;
		this.numeroPers = numeroPers;
		this.occupato = occupato;
	}
	public int getIdTavolo() {
		return idTavolo;
	}
	public void setIdTavolo(int idTavolo) {
		this.idTavolo = idTavolo;
	}
	public int getNumeroPers() {
		return numeroPers;
	}
	public void setNumeroPers(int numeroPers) {
		this.numeroPers = numeroPers;
	}
	public boolean isOccupato() {
		return occupato;
	}
	public void setOccupato(boolean occupato) {
		this.occupato = occupato;
	}
	
	/*public void setTavoli() {
		
		for(int i=0;i<2;i++) {
			this.setNumeroPers(10);
		}
		for(int i=2;i<6;i++) {
			this.setNumeroPers(8);
		}
		for(int i=6;i<10;i++) {
			this.setNumeroPers(6);
		}
		for(int i=10;i<14;i++) {
			this.setNumeroPers(4);
		}
		
	}*/
	
}
