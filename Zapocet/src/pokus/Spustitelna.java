package pokus;

public class Spustitelna {
	public static void main(String[] args) {
		Mapa m = new Mapa();
		
		Auto a1 = new Auto("Ferrari", 4, 8);
		Auto a2 = new Auto("Lambo", 4, 3);
		Auto a3 = new Auto("Fiat", 3, 33);
		
		m.addAuto(a1);
		m.addAuto(a2);
		m.addAuto(a3);
		
		System.out.println(m.getPocetAut());
		
		m.removeAuto(0);
		System.out.println(m.getPocetAut());

		
		
		
	}
}
