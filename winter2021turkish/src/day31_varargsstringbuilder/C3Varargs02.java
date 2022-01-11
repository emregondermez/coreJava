package day31_varargsstringbuilder;

public class C3Varargs02 {

	public static void main(String[] args) {
		// istedigimiz kadar sayiyi girdigimizde tum sayilari toplayan bir method yazalim
		
		
		toplama(2,5);
		toplama(2,5,65);
		toplama(2,5,11,5);
		toplama(2,5,45,45,2);
		toplama(2,5,7,96,552,65);
	}

	public static void toplama(int... var) {
		int toplam=0;
		for (int i : var) {
			toplam+=i;
		}System.out.println("toplam : "+toplam);
		
	}

}
