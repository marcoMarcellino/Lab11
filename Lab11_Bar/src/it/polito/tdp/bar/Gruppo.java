package it.polito.tdp.bar;

import java.time.LocalTime;

public class Gruppo {

    private int id;
	private int time;
	private int numPersone;
	private int durata;
	private float tolleranza;

	private int maxMin=120;
	private int minMinuti=60;
	
	public Gruppo(int id) {
		this.time = LocalTime.now().getMinute();
		this.numPersone = (int) ((Math.random()*10)+1);
		this.durata = (int) (((maxMin-minMinuti)/2)*Math.random());
		this.tolleranza = (float) Math.random();
		
	}
	
	public int getId() {
		return id;
	}

	public int getTime() {
		return time;
	}
	public int getNumPersone() {
		return numPersone;
	}
	public int getDurata() {
		return durata;
	}
	public float getTolleranza() {
		return tolleranza;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setNumPersone(int numPersone) {
		this.numPersone = numPersone;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}
	
	
}
