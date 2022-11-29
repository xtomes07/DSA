package Uzly;

public class Spustitelna {
	public static void main(String[] args) {
		Uzel u1 = new Uzel("U1");
		Uzel u2 = new Uzel("U2");
		Uzel u3 = new Uzel("U3");
		Uzel u4 = new Uzel("U4");
		Uzel u5 = new Uzel("U5");
		Uzel u6 = new Uzel("U6");
		
		u1.addSouseda(u2);
		u1.addSouseda(u6);
		u1.addSouseda(u5);
		u1.addSouseda(u4);
		
		u2.addSouseda(u1);
		u2.addSouseda(u5);
		u2.addSouseda(u3);
		
		u5.addSouseda(u4);
		
		
	}
}
