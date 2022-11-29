package cyklickySeznam;

public class Spustitelna {
	public static void main(String[] args) {
		CyklickySeznam mujSeznam = new CyklickySeznam();
		
		mujSeznam.pridej(1);
		mujSeznam.pridej(10);
		mujSeznam.pridej(100);
		mujSeznam.pridej(1000);
		mujSeznam.pridej(10000);
		
		mujSeznam.odstranit(100);
	}
}
