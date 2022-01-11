package day10_Ternary_SwichCase;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// Eğer çalışan kadınsa 60 yaşından 
		// büyük olduğunda emekli olabilir,
		// Çalışan erkekse 65 yaşından büyükse emekli olabilir.

		// her seferinde Scanner olusturmak yerine test datalarimizi 
		// variable olarak da olusturabiliriz ve kod yazimi bittiginde bu test datalarini
		// degistirerek kodalarimizi test edebiliriz
		
		
		char cinsiyet = 'k';
		int yas = 67;
		
		String sonuc = cinsiyet == 'k' ? (yas>=60 ? "emekli olabilirsin" : "emekli olamazsin") 
				: (yas>=65 ? "emekli olabilirsin" : "emekli olamazsin");
		
		System.out.println(sonuc);
		
	}

}
