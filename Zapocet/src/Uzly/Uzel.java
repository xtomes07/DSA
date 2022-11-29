package Uzly;

import java.util.Vector;

public class Uzel {
	private String nazev;
	private Vector<Uzel> dalsiSousede = new Vector<>();



	public Uzel(String nazev) {
		this.nazev = nazev;
	}

	public Vector<Uzel> getDalsiSousede() {
		return dalsiSousede;
	}

	public void setDalsiSousede(Vector<Uzel> dalsiSousede) {
		this.dalsiSousede = dalsiSousede;
	}

	public void addSouseda(Uzel dalsiSousede) {
		this.dalsiSousede.add(dalsiSousede);
		
	}
	
	
}
