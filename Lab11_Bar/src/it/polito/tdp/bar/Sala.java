package it.polito.tdp.bar;

import java.util.*;

public class Sala {
	
private List<Tavolo> tavoli = new ArrayList<Tavolo>(15);


public Sala() {
	
}


public void aggiungi(int numTav,int numPosti) {
    for(int i=numTav;i<tavoli.size()-13;i++) {
    tavoli.get(i).setNumeroPers(numPosti);
    }
    for(int i=numTav;i<tavoli.size()-9;i++) {
        tavoli.get(i).setNumeroPers(numPosti);
        }
    for(int i=numTav;i<tavoli.size()-5;i++) {
        tavoli.get(i).setNumeroPers(numPosti);
        }
    for(int i=numTav;i<tavoli.size();i++) {
        tavoli.get(i).setNumeroPers(numPosti);
        }
    
}


}
