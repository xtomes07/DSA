package NFS_1_3;

import java.util.Vector;

public class Mapa {
	private Vector<Auto> auta = new Vector<>();

	public void add(Auto auto) {
		auta.add(auto);
	}
	public Auto getAuto(int index) {
		return auta.elementAt(index);
	}
	public void removeAuto(int index) {
		auta.remove(index);
	}
	public int getPocetAut() {
		return auta.size();
	}
}
