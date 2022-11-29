package LinSeznam;

public class LinearniSeznam {
	private Uzel prvni;

	public void pridejNaZacatek(int data) {
		Uzel aktualni = new Uzel();
		aktualni.setData(data);
		aktualni.setDalsi(prvni);
		prvni = aktualni;
	}

	public void odstranZeZacatku() {
		if (prvni != null) {
			prvni = prvni.getDalsi();
		}
		
	}

	public boolean obsahuje(int data) {
		Uzel aktualni = new Uzel();
		aktualni = prvni;
		
		while (aktualni != null) {
			if (aktualni.getData() == data) {
				return true;
			}
			aktualni = aktualni.getDalsi();
		}
		return false;
		
	}

	public void jePrazdny() {
		if (prvni == null) {
			System.out.println("Seznam je prazdny");
		} else {
			System.out.println("Seznam neni prazdny");
		}
		
	}

	public void vypis() {
		Uzel aktualni = new Uzel();
		aktualni = prvni;
		System.out.println("Seznam obsahuje: ");
		
		while (aktualni != null) {
			System.out.println(aktualni.getData());
			aktualni = aktualni.getDalsi();
		}
		
	}

	public void reverse() {
		LinearniSeznam reverse = new LinearniSeznam();
		Uzel aktualni = new Uzel();
		aktualni = prvni;
		
		while (aktualni != null) {
			reverse.pridejNaZacatek(aktualni.getData());
			aktualni = aktualni.getDalsi();
			
		}
		
		this.prvni = reverse.prvni;
	}

	public void velikost() {
		Uzel aktualni = new Uzel();
		aktualni = prvni;
		int pocitadlo = 0;
		
		while (aktualni != null) {
			pocitadlo = pocitadlo + 1;
			aktualni = aktualni.getDalsi();
		}
		
		System.out.println("Velikost seznamu je: " + pocitadlo);
		
	}

	public void odstranZKonce() {
		Uzel aktualni = new Uzel();
		aktualni = prvni;
		
		while (aktualni.getDalsi().getDalsi() != null) { //potrebuju se zastavit u predposleniho prvku
			aktualni = aktualni.getDalsi();
		}
		 aktualni.setDalsi(null);
		
	}
	

}
