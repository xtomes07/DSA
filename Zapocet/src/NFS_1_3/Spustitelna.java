package NFS_1_3;

public class Spustitelna {
	public static void main(String[] args) {
		Mapa m = new Mapa();
		
		Auto a1 = new Auto("Škoda",1,5);
		Auto a2 = new Auto("Audi",2,6);
		Auto a3 = new Auto("BMW",3,7);
		Auto a4 = new Auto("FORD",4,8);
		
		m.add(a1);
		m.add(a2);
		m.add(a3);
		m.add(a4);
		
		System.out.println(m.getPocetAut());
		
		m.add(new Auto("SEAT", 45, 5));
		
		System.out.println(m.getPocetAut());
		
		m.removeAuto(2);
		
		System.out.println(m.getPocetAut());
		
		System.out.println(m.getAuto(0).getNazev());
	}
}
