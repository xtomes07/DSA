package pokus;

import java.util.Vector;

public class Mapa {
	private Vector<Auto> seznamAut = new Vector<>();

	public void addAuto(Auto seznamAut) {
		this.seznamAut.add(seznamAut);
		}

	public Auto getAuto(int i) {
		return seznamAut.get(i);
	}

	public void removeAuto(int i) {
		this.seznamAut.remove(i);
	}

	public int getPocetAut() {
		return seznamAut.size();		
	}
	
}
