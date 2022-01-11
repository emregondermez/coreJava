package day35_inheritance;

public class Personel {

	public String isim;
	public int sayi;
	
	
	public Personel() {
		super();
		/*
		 Java'dan yardim alarak bir constructor olusturdugumuzda 
		 java constructor'un ilk satirina super(;) keyword'u ekler 
		 eger icinde bulundugumuz class bir child class degilse bu keyword silinebilir
		 biz super(); keyword'u kullnamdik cunku bizim class larimiz child class degildi
		 */
	
	System.out.println("Personel parametresiz constructor calisti");
	}


	public Personel(String isim, int sayi) {
		super();
		System.out.println("Personel parametreli constructor calisti"); 
	}
	
	
	// her class default consructur'a sahiptir.
	// default constructor'un parametresi yoktur
	// biz parametreli ve ya parametresiz constructor olusturdugumuzda
	// default constructor silinir
	// eger biz sadece 1 tane parametreli constructor olusturursak Java default olani sildigi icin parametresiz cons. kalmaz 
	// Dolayisiyla parametereli bir cons olusturdugumuzda mutlaka default cons yerine de parametresiz bie cons olusturmamiz gerekir
	
	
	
}
