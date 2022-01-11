package day11_StringManipulation;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2 yi karsilastirir ve String olarak esit olup olmadiklarina bakarak
		//sonuc olarak true veya false dondurur(sonuc)

		//bazi methodlarin yaptiklari islem ile dondurduklari sonuc farkli olabilir
		// bir methoda git ali ismindeki elementleri sil deriz
		// o dagidip ali yi bulur ve siler
		
		
		String str = "Ali Can";
		String str2 = "Ali Can";
	
		
		//str ile str2 esit olup olmadigini yazdirin
		
		System.out.println(str.equals(str2));// true
	
		System.out.println(str.equals(str) ? "esit" : "esit degil");
	
		// Java'da Stringler case sensitive dir. ==> buyuk-kucuk harf duyarlidir.
		
	}

}
