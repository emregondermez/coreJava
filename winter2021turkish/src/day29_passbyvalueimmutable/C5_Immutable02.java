package day29_passbyvalueimmutable;

public class C5_Immutable02 {

	public static void main(String[] args) {
		// degisikliggi kalici yapmak icin atama yaparsak
		// immutable class'lar nasil davranir

		String isim = "Ali";

		isim = isim +"";
		System.out.println(isim.equals("Ali"));
	
	System.out.println(isim=="Ali");
	}
}
