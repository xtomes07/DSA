package Hashset;

import java.util.HashSet;

public class Spustitelna {
	public static void main(String[] args) {
		HashSet<Integer> mn1 = new HashSet<>();//mn1 => mnozina, mnoziny odstranuji duplicity
		mn1.add(10);
		mn1.add(100);
		mn1.add(101);
		mn1.add(110);
		mn1.add(1480);
		mn1.add(1550);
		
		System.out.println(mn1.size());
		System.out.println(mn1);
		
		//Hashset uklada hodnoty pseudonahodne
	}
}
