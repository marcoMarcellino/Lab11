package it.polito.tdp.bar.model;



public class Gruppo {

   
	private int arrivo;
	private int durata;
	private int numPersone;
	private float tolleranza;
	public Gruppo(int arrivo, int durata, int numPersone, float tolleranza) {
		super();
		this.arrivo = arrivo;
		this.durata = durata;
		this.numPersone = numPersone;
		this.tolleranza = tolleranza;
	}
	public int getArrivo() {
		return arrivo;
	}
	public void setArrivo(int arrivo) {
		this.arrivo = arrivo;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public int getNumPersone() {
		return numPersone;
	}
	public void setNumPersone(int numPersone) {
		this.numPersone = numPersone;
	}
	public float getTolleranza() {
		return tolleranza;
	}
	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}
	@Override
	public String toString() {
		return "Gruppo [arrivo=" + arrivo + ", durata=" + durata + ", numPersone=" + numPersone + ", tolleranza="
				+ tolleranza + "]";
	}
	
	

}