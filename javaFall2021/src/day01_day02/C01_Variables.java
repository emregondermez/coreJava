package day01_day02;

public class C01_Variables {

	public static void main(String[] args) {
		
		// variable olusturmak ve deger atamak farkli islemlerdir
		// istersek once variable olusturma ve deger atamayi 
		// tek satirda yapabiliriz
		// istersek de once olusuturur istedigimiz 
		// zaman da deger atayabiliriz
		
		
	String ogrenciIsim = "Celal";
	
	System.out.println(ogrenciIsim);
	
	int sayi;
	sayi=99;
	System.out.println(sayi);
		// daha once olusturulmus ve deger atamasi yapilmis bir degiskene
		// yeniden deger atayabiliriz 
		// bu dudumda java variable'nin eski degerini silip yeni degeri
		// variable ye atar.
	sayi=25;
	System.out.println(sayi);
	
	ogrenciIsim = "Mustafa";
	System.out.println(ogrenciIsim);
		
	}
	
}
