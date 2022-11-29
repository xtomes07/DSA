package ObousmernyLinSeznam;

public class Seznam {
	private Uzel centralni;

	public void pridej(int data) {
		Uzel novy = new Uzel();
		novy.setData(data);
		
		if (centralni == null) {
			centralni = novy;
			centralni.setDalsi(null);
			centralni.setPredchozi(null);
		} else {
			novy.setDalsi(centralni);
			centralni.setPredchozi(novy);
			centralni = novy;
		}
	
	}

	public void odstran(int data) {
		Uzel aktualni = new Uzel();
		Uzel tmp = new Uzel();
		aktualni = centralni;
		
		while (aktualni != null) {
			if (aktualni.getData() == data) {				
				if (aktualni.getDalsi() == null) { // kdyz je prvek na konci
					tmp = aktualni;
					aktualni = aktualni.getPredchozi();
					aktualni.setDalsi(null);
					aktualni = tmp;
					aktualni.setPredchozi(null);
				} else if (aktualni.getPredchozi() == null) {
					tmp = aktualni;
					aktualni = aktualni.getDalsi();
					centralni = aktualni;
					aktualni.setPredchozi(null);
					aktualni = tmp;
					aktualni.setDalsi(null);
				} else {
				
				aktualni = aktualni.getPredchozi();
				aktualni.setDalsi(aktualni.getDalsi().getDalsi());
				
				aktualni = aktualni.getDalsi();
				aktualni.setPredchozi(aktualni.getPredchozi().getPredchozi());
				
				}
				System.out.println("Odstranen: " + data);
				return;
				
			} else {
				aktualni = aktualni.getDalsi();
			}
			
		}
		System.out.println("nenalezen");
		
	}

}
