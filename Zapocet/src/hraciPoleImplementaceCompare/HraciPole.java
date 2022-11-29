package hraciPoleImplementaceCompare;

import java.util.ArrayList;



public class HraciPole implements Comparable<HraciPole>{ //moje implements Comparable
	private int[][] data = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, -1 } };
	private int x = 2;
	private int y = 2;
	private ArrayList<Integer> pohyby = new ArrayList<Integer>();

	public static final int UP = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int RIGHT = 4;

	public HraciPole klonujAPohni(int smer) {
		HraciPole nove = new HraciPole();
		nove.x = this.x;
		nove.y = this.y;
		nove.pohyby.addAll(this.pohyby);
		nove.pohyby.add(smer);
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				nove.data[x][y] = this.data[x][y];
			}
		}

		boolean jeMozny = nove.pohni(smer);
		if (jeMozny) {
			return nove;
		} else {
			return null;
		}
	}

	public boolean pohni(int smer) {
		switch (smer) {
		case UP:
			// nahoru
			if (y < 1) {
				return false;
			}
			data[x][y] = data[x][y - 1];
			data[x][y - 1] = -1;
			y = y - 1; // y--;
			return true;
		case DOWN:
			// nahoru
			if (y > 1) {
				return false;
			}
			data[x][y] = data[x][y + 1];
			data[x][y + 1] = -1;
			y++; // y = y + 1;
			return true;
		case LEFT:
			// nahoru
			if (x < 1) {
				return false;
			}
			data[x][y] = data[x - 1][y];
			data[x - 1][y] = -1;
			x = x - 1; // y--;
			return true;
		case RIGHT:
			if (x > 1) {
				return false;
			}
			data[x][y] = data[x + 1][y];
			data[x + 1][y] = -1;
			x++; // y = y + 1;
			return true;// TODO
		}
		return false;
	}


	@Override
	public String toString() {
		String res = "pohyby:" + pohyby + "\n";
		for (int iy = 0; iy < 3; iy++) {
			for (int ix = 0; ix < 3; ix++) {
				res += data[ix][iy] + ",";
			}
			res += "\n";
		}
		return res;
	}

	public boolean jeReseni() { //moje 18minuta
		int[][] reseni = {{1,4,7},{2,5,8},{3,6,-1}};
		for (int x = 0; x < reseni.length; x++) {
			for (int y = 0; y < reseni[0].length; y++) {
				if (data[x][y] != reseni[x][y]) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public int compareTo(HraciPole p) { //moje
		for (int ix = 0; ix < 3; ix++) {
			for (int iy = 0; iy <3; iy++) {
				if (data[ix][iy] == p.data[ix][iy]) {
					continue;
				} else if (data[ix][iy] < p.data[ix][iy]) {
					return -1;
				} else if (data [ix][iy] > p.data[ix][iy]) {
					return 1;
				}
			}
		}
		return 0;
	}
	@Override
	public boolean equals (Object obj) { //moje
		HraciPole p = (HraciPole) obj;
		return compareTo(p) == 0;
	}
	
}
