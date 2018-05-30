package it.polito.tdp.bar;

import java.util.*;

public class Sala {
	
private List<Tavolo> tavoli = new ArrayList<Tavolo>(15);

public void aggiungi(int numTav,int numPosti) {
    for(int i=0;i<tavoli.size()-13;i++) {
    tavoli.get(i).setNumeroPers(numPosti);
    }
    for(int i=2;i<tavoli.size()-9;i++) {
        tavoli.get(i).setNumeroPers(numPosti);
        }
    for(int i=6;i<tavoli.size()-5;i++) {
        tavoli.get(i).setNumeroPers(numPosti);
        }
    for(int i=10;i<tavoli.size();i++) {
        tavoli.get(i).setNumeroPers(numPosti);
        }
    
}


}
