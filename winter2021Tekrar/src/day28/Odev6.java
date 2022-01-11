package day28;

public class Odev6 {

	public static void main(String[] args) {
		/*
		 * StringMethods: Çift uzunlukta bir degiskenin ilk yarısını konsolda yazdirmak
		 * için bir Java programı yazıniz. ORNEK: INPUT : Python OUTPUT : Pyt
		 */
		
		String isim= "Abdurrahman";
		
		ikiyeBol(isim);
		
		
		
		
		
	}

	public static void ikiyeBol(String isim) {
		System.out.println(isim.substring(0, isim.length()/2));
		
	}

}
