package it.polito.tdp.bar.model;

import java.util.ArrayList;
import java.util.List;

public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m = new Model();
		m.simula();
		
		//List<Tavolo> tavoli = new ArrayList<>(simulazione.getTavoli());
		
		//for(Tavolo t : tavoli) {
		//	System.out.println(t);
		//}
		
	//	simulazione.run();
		System.out.println("numero clienti arrivati : "+m.simulazione.getNumero_totale_clienti());
		System.out.println("numero clienti insoddisfatti : "+m.simulazione.getNumero_clienti_insoddisfatti());
		System.out.println("numero clienti soddisfatti : "+m.simulazione.getNumero_clienti_soddisfatti());
		

	}

}
