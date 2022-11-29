package Adresare_1_1;

public class Spustitelna {
	public static void main(String[] args) {
		Adresar a1 = new Adresar();
		Adresar a2 = new Adresar();
		Adresar a3 = new Adresar();
		Adresar a4 = new Adresar();
		Adresar a5 = new Adresar();
		
		a1.setDalsiLevy(a4);
		a1.setDalsiPravy(a2);
		a1.setData(45);
		
		a4.setData(78);
		
		a2.setDalsiLevy(a5);
		a2.setDalsiPravy(a3);
		a2.setData(55);
		
		a5.setData(88);
		
		a3.setData(1);
		
		
		System.out.println(a2.getDalsiLevy());
	}
}
