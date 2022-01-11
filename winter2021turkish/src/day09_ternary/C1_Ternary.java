package day09_ternary;

public class C1_Ternary {

	public static void main(String[] args) {
		
		
		//ternary islemi bir sonuc dondurdugundan bir variable olusturup ona assign etmeliyiz 
		
		int sayi=10;
		
		String sonuc = (sayi %2 ==0) ? "cift sayi" : "tek sayi" ;
		System.out.println(sonuc);
		
		
		// ben bir veriable a assign etmek istemezsem
		// syso icine yazilir
		System.out.println(sayi %2 ==0 ? "cift sayi" : "tek sayi");
		
		
		//basina aciklama yazmak istersek:
		// ternary operatorunu parantez icine aliriz
		
		System.out.println("sonuc= "+ (sayi %2 ==0 ? "cift sayi" : "tek sayi"));
	
		
	
	
	}

}
