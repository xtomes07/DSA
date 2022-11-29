package binarniStromy;

public class BinarniStrom {
	private Uzel koren;
	
	public void pridej(int data) {
		if (koren == null) {
			koren = new Uzel();
			koren.setData(data);
			return;
		}
		
		Uzel aktualni = new Uzel();
		aktualni = koren;
		
		for(;;) {
			if (aktualni.getData() == data) {
				return;
			} else if (aktualni.getData() > data) {
				if (aktualni.getLevy() == null) {
					Uzel novy = new Uzel();
					novy.setData(data);
					aktualni.setLevy(novy);
					return;
				} else {
					aktualni = aktualni.getLevy();
				}
			} else if (aktualni.getData() < data) {
				if (aktualni.getPravy() == null) {
					Uzel novy = new Uzel();
					novy.setData(data);
					aktualni.setPravy(novy);
					return;
				} else {
					aktualni = aktualni.getPravy();
				}
			}
		}
	}
	
	public void vypisInOrder() {
		vypisInOrder(koren);
		
	}
	private void vypisInOrder(Uzel u) {
		if (u == null) {
			return;
		}
		vypisInOrder(u.getLevy());
		System.out.println(u.getData());
		vypisInOrder(u.getPravy());
	}

	public void vypisPreOrder() {
		vypisPreOrder(koren);
		
	}
	private void vypisPreOrder(Uzel u) {
		if (u == null) {
			return;
		}
		System.out.println(u.getData());
		vypisPreOrder(u.getLevy());
		vypisPreOrder(u.getPravy());
		
	}

	public void vypisPostOrder() {
		vypisPostOrder(koren);
		
	}
	private void vypisPostOrder(Uzel u) {
		if (u == null) {
			return;
		}
		vypisPostOrder(u.getLevy());
		vypisPostOrder(u.getPravy());
		System.out.println(u.getData());
		
	}

	public boolean obsahuje(int data) {
		Uzel aktualni = new Uzel();
		aktualni = koren;
		
		while (aktualni != null) {
			if (aktualni.getData() == data) {
				return true;
			} else if (aktualni.getData() < data) {
				aktualni = aktualni.getPravy();
			} else if (aktualni.getData() > data) {
				aktualni = aktualni.getLevy();
			}
		}
		return false;

	}
	
	// nejhlubsi uzel
		public void vyskaStromu() {
			vyskaStromu(koren);
		}
		
		private int vyskaStromu(Uzel uzel) {
			if(uzel == null)
				return 0;
			int levaVetev = vyskaStromu(uzel.getLevy());
			int pravaVetev = vyskaStromu(uzel.getPravy());
			return Math.max(levaVetev, pravaVetev) + 1;
		}
		
		public void nejhlubsi() {
			System.out.print("Nejnizsi uzel je: ");
			nejhlubsi(koren, vyskaStromu(koren));
		}
		
		private void nejhlubsi(Uzel uzel, int vyska) {
			if(uzel == null)
				return;
			if (vyska == 1) {
				System.out.println(uzel.getData());
			} else if(vyska > 1) {
				nejhlubsi(uzel.getLevy(), vyska - 1);
				nejhlubsi(uzel.getPravy(), vyska - 1);	
			}
		}

}
