package it.polito.tdp.bar;

import java.util.PriorityQueue;

public class Simulazione {
    Sala sala;
    
    
	// Coda degli eventi
	private PriorityQueue<Evento> queue = new PriorityQueue<>() ;
	
	// Parametri di simulazione // Impostati all'inizio // Costanti durante la simulazione
	
	private void variabili() {
		final int numPostiTot=15;
		this.sala.aggiungi(2, 10);
		this.sala.aggiungi(4, 8);
		this.sala.aggiungi(4, 6);
		this.sala.aggiungi(5, 4);
	}
	
	
	
	// Modello del mondo // Stato del sistema // Evolvono in continuazione
	private int disponibili ; // numero di auto disponibili 
		
	// Valori da calcolare // Output
	private int clientiArrivati ; // clienti arrivati al noleggio
	private int clientiInsoddisfatti ; // numero di clienti insoddisfatti
	
	
	
}
