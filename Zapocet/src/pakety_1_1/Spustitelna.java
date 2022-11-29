package pakety_1_1;

public class Spustitelna {
	public static void main(String[] args) {
		Paket p1= new Paket();
		Paket p2= new Paket();
		Paket p3= new Paket();
		Paket p4= new Paket();
		
		p1.setDalsiPaket(p2);
		p2.setDalsiPaket(p3);
		p3.setDalsiPaket(p4);
		
		p1.setData(45);
		p2.setData(78);
		p3.setData(8);
		p4.setData(1);

	
	}
}
