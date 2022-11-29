package ObousmernyLinSeznam;

public class Spustitelna {
	public static void main(String[] args) {
		Seznam mujSeznam = new Seznam();
		
		mujSeznam.pridej(1);
		mujSeznam.pridej(10);
		mujSeznam.pridej(100);
		
		mujSeznam.odstran(100);
		
	}
}
