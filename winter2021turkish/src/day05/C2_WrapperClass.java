package day05;

public class C2_WrapperClass {
	 	public static void main(String[] args) {
			// java da iki tur data vardir
	 		// primitive ve non-primive
	 		//primive data turleri sadece value icerir
	 		// non-primitive data turleri ise deger ve metodlari icerir
	 		
	 		// wrapper class : Java'nin primitive data turleri ile bazi metodlari kullanabilmemiz icin
	 		// olusturdugu Class'lardir.
	 		
	 		//boolean, char,  byte, short, int, long, float, double
	 		
	 		byte sayi=10;
	 		System.out.println(sayi);
	 		Byte sayi2=11;//ismen primitive data turu ile ayni olan non-primitive datalara wrapper denir
	 		System.out.println(sayi2);
	 		
	 		Byte byteMinSayi = Byte.MIN_VALUE;
	 		System.out.println(byteMinSayi);
	 		
	 		
	 		Byte byteMaxSayi = Byte.MAX_VALUE;
	 		System.out.println(byteMaxSayi);
	 		
	 		
	 		// variable olusturmadan direk olarak short'un en kucuk ve en buyuk degerini yazdiralim
	 		
	 		System.out.println(Short.MAX_VALUE );
	 		System.out.println(Short.MIN_VALUE);

	 		
	 		// integer veri turunun wrapper Class'i Integer dir.
	 		
	 		System.out.println(Integer.MIN_VALUE);
	 		System.out.println(Integer.MAX_VALUE);
	 		
	 		
	 		// Boolean, Character, Byte, Short, Integer, Long ,Float, Double
	 		
	 		
	 		
	 		
		}
}
