package day27_Constructor;

public class TirRunner {

	public static void main(String[] args) {
		// bir tane tum ozellikleri degistiren constructor olusturalim

		Tir tir1 = new Tir(5000, "Axor", "Beyaz", 2020, false);

		System.out.println(tir1.km + " " + tir1.model + " " + tir1.renk + " " + tir1.yil + " " + tir1.satilikMi);
	
	
	
	// uc ozelligi degistiren constructor olusturalim
		
	Tir tir2 = new Tir(12000,"kar","kirmizi");
	System.out.println(tir2.km+" "+tir2.model+" "+tir2.renk);
	
	}

}
