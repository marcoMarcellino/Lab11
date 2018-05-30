package it.polito.tdp.bar.model;

import java.util.*;
import java.util.PriorityQueue;


import javafx.event.EventType;

public class Simulazione {
   
    
	// Coda degli eventi
	private PriorityQueue<Evento> queue = new PriorityQueue<>(new EventComparatore()) ;
	
	// Parametri di simulazione // Impostati all'inizio // Costanti durante la simulazione
	private int NUM_EVENTI = 2000;//costante
	private int DURATA_MINIMA = 60;
	private int DURATA_MASSIMA = 120;
	private List<Tavolo> tavoli = new ArrayList<>();
	
	// Modello del mondo // Stato del sistema // Evolvono in continuazione
	
		
	// Valori da calcolare // Output
	private int numero_totale_clienti;
	private int numero_clienti_soddisfatti;
	private int numero_clienti_insoddisfatti;
	private Statistiche statistica;
	
	public void init() {
		
		creaTavoli();
		Collections.sort(tavoli);
		
		int tempo=0;
		
		for(int i=0;i<2000;i++) {
			int arrivo=(int) (1+Math.random()*10);
			int numeroPersone=(int) (1+Math.random()*10);
			int durata= (int) (61+60*Math.random());
			float tolleranza= (float) Math.random();
			tempo+=arrivo;
			
			Gruppo gruppo= new Gruppo(tempo, durata, numeroPersone, tolleranza);
			Evento e = new Evento(durata,it.polito.tdp.bar.model.EventType.GRUPPO_IN, gruppo);
			
			queue.add(e);
			
			numero_totale_clienti+=  e.getGruppo().getNumPersone();
			
		}
		
	}

	private void creaTavoli() {

		for(int i =0 ; i< 2  ; i++) {
			tavoli.add(new Tavolo(i, 10, false));
		}
		for(int i = 2 ; i<6; i++) {
			tavoli.add(new Tavolo(i,8,false ));
		}
		for(int i = 6 ; i<10; i++) {
			tavoli.add(new Tavolo(i,6,false));
		}
		for(int i = 10 ; i<15; i++) {
			tavoli.add(new Tavolo(i,4,false));
		}
	
		
	}
	
	public void run() {

		Evento e ;
		while((e = queue.poll()) != null) {
			processEvent(e) ;
		}
		statistica=new Statistiche(numero_totale_clienti, numero_clienti_soddisfatti, numero_clienti_insoddisfatti);
	}

	private void processEvent(Evento e) {
		switch (e.getTipo()) {
		case GRUPPO_IN:
			int numClienti = e.getGruppo().getNumPersone();
			Tavolo tavDisp = tavoloDisponibile(numClienti);
			if(tavDisp==null) {//tavolo non disponibile,devono aspettare
				float probabilita= (float) Math.random();
				if(probabilita>e.getGruppo().getTolleranza()) {
					numero_clienti_insoddisfatti+=e.getGruppo().getNumPersone();
				}else
					numero_clienti_soddisfatti+=e.getGruppo().getNumPersone();
			}
			
			else {//tavolo disponibile
				Evento e1= new Evento(e.getMinuti()+e.getGruppo().getDurata(), it.polito.tdp.bar.model.EventType.GRUPPO_OUT, e.getGruppo());
				e1.setTavolo(tavDisp);
				e1.getTavolo().setOccupato(true);
				queue.add(e1);
				numero_clienti_soddisfatti+=e.getGruppo().getNumPersone();
			}
			
			break;

		case GRUPPO_OUT:
			e.getTavolo().setOccupato(false);
			break;
		}
		
	}

	private Tavolo tavoloDisponibile(int numClienti) {
		for(Tavolo t: tavoli) {
			if(!t.isOccupato() && t.getNumeroPers()>=numClienti && numClienti>=t.getNumeroPers()*0.5) {
				return t;
			}
		}
		return null;
	}

	public List<Tavolo> getTavoli() {
		return tavoli;
	}

	public int getNumero_totale_clienti() {
		return numero_totale_clienti;
	}

	public int getNumero_clienti_soddisfatti() {
		return numero_clienti_soddisfatti;
	}

	public int getNumero_clienti_insoddisfatti() {
		return numero_clienti_insoddisfatti;
	}

	public Statistiche getStatistica() {
		return statistica;
	}
	
	
	
}
