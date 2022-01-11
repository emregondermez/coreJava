package day21_Scope;

public class Scope2 {


	public static void main(String[] args) {
		
		//static variable'lar icin obje olusturma ihtiyyaci yoktur
		// baska bir class'tan variable'lar a ulasmak istedigimizde 
		// ulasmak istedigimiz Calss'in adi + ' . ' static variable adi yazmamiz yeterlidir.
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);
		
	}

}
