package binarniStromy;

public class Spustitelna {
	public static void main(String[] args) {
		BinarniStrom mujStrom = new BinarniStrom();
		
		mujStrom.pridej(7);
		mujStrom.pridej(5);
		mujStrom.pridej(14);
		mujStrom.pridej(1);
		mujStrom.pridej(6);
		mujStrom.pridej(16);
		mujStrom.pridej(10);
		
		mujStrom.vypisInOrder();
		System.out.println();
		mujStrom.vypisPreOrder();
		System.out.println();
		mujStrom.vypisPostOrder();
		
		System.out.println();
		System.out.println(mujStrom.obsahuje(10));
		
		mujStrom.pridej(13);
		
		mujStrom.vyskaStromu();
		mujStrom.nejhlubsi();

	}
}
