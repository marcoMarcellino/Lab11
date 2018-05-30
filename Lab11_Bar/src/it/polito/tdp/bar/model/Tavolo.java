package it.polito.tdp.bar.model;


public class Tavolo implements Comparable<Tavolo>{

	private int idTavolo;
	private int capacita;
	private boolean occupato;
	
	
	public Tavolo(int idTavolo, int capacita, boolean occupato) {
		super();
		this.idTavolo = idTavolo;
		this.capacita = capacita;
		this.occupato = occupato;
	}
	public int getIdTavolo() {
		return idTavolo;
	}
	public void setIdTavolo(int idTavolo) {
		this.idTavolo = idTavolo;
	}
	public int getNumeroPers() {
		return capacita;
	}
	public void setNumeroPers(int numeroPers) {
		this.capacita = numeroPers;
	}
	public boolean isOccupato() {
		return occupato;
	}
	public void setOccupato(boolean occupato) {
		this.occupato = occupato;
	}
	@Override
	public String toString() {
		return "Tavolo [idTavolo=" + idTavolo + ", numeroPers=" + capacita + ", occupato=" + occupato + "]";
	}
	@Override
	public int compareTo(Tavolo o) {
		return this.capacita-o.getNumeroPers();
	}
	
	
}
