package TreeSet;

import java.util.TreeSet;

public class Spustitelna {
	public static void main(String[] args) {
		TreeSet<Integer> mn1 = new TreeSet<>(); //mnozina odstanuje duplicity
		
		mn1.add(10);
		mn1.add(110);
		mn1.add(1110);
		mn1.add(101);
		mn1.add(1);
		
		System.out.println(mn1.size());
		System.out.println(mn1);
		//Treeset na rozdil od Hashsetu prvky seradi podle velikosti
	}
}
