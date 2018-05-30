package it.polito.tdp.bar.model;

public class Model {

	Simulazione simulazione;
	public Model() {
		
	}
	
	public void simula() {
		simulazione=new Simulazione();
		simulazione.init();
		simulazione.run();
	}
	public Statistiche getStatistiche() {
		return simulazione.getStatistica();
	}
	
}
