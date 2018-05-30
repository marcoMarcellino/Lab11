package it.polito.tdp.bar.model;

import java.util.Comparator;

public class EventComparatore implements Comparator<Evento> {

	@Override
	public int compare(Evento e1, Evento e2) {
		return e1.getMinuti()-e2.getMinuti();
	}

}
