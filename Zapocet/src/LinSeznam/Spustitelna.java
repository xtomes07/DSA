package LinSeznam;

public class Spustitelna {
	public static void main(String[] args) {
		LinearniSeznam mujSeznam = new LinearniSeznam();
		
		mujSeznam.pridejNaZacatek(1);
		mujSeznam.pridejNaZacatek(10);
		mujSeznam.pridejNaZacatek(100);
		mujSeznam.pridejNaZacatek(1000);
		mujSeznam.pridejNaZacatek(10000);
		
		mujSeznam.odstranZeZacatku();
		
		System.out.println(mujSeznam.obsahuje(10));
		
		mujSeznam.jePrazdny();
		
		mujSeznam.vypis();
		
		mujSeznam.reverse();
		
		mujSeznam.vypis();
		
		mujSeznam.velikost();
		
		mujSeznam.odstranZKonce();
		
		mujSeznam.vypis();
		
		
	}

}
