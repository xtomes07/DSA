package cyklickySeznam;

public class CyklickySeznam {
	private Uzel prvni;
	private Uzel posledni;

	public void pridej(int data) {
		Uzel novy = new Uzel();
		novy.setData(data);
		if (prvni == null) {
			novy.setDalsi(novy);
			prvni = novy;
			posledni = novy;
		} else {
			novy.setDalsi(prvni);
			posledni.setDalsi(novy);
			prvni = novy;
		}
		
		
	}

	public void odstranit(int data) {
		Uzel aktualni = new Uzel();
		Uzel tmp = new Uzel();
		aktualni = prvni;
		tmp = posledni;
		
		while (aktualni.getDalsi() != prvni) {
			if (aktualni.getData() == data) {
				aktualni = tmp;
				aktualni.setDalsi(aktualni.getDalsi().getDalsi());
				System.out.println("Smazan: " + data);
				return;
			} else {
				aktualni = aktualni.getDalsi();
				tmp = tmp.getDalsi();
			}
		}
		System.out.println("Prvek nenalezen:" + data);
		
	}

}
