package ObousmernyLinSeznam;

public class Uzel {
	private int data;
	private Uzel dalsi;
	private Uzel predchozi;
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Uzel getDalsi() {
		return dalsi;
	}
	public void setDalsi(Uzel dalsi) {
		this.dalsi = dalsi;
	}
	public Uzel getPredchozi() {
		return predchozi;
	}
	public void setPredchozi(Uzel predchozi) {
		this.predchozi = predchozi;
	}
	
	

}
