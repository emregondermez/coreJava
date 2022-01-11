package day35_Encapsulation_Inheritance;

public class C02_Setters {

	public static void main(String[] args) {
		// ogretmen ogrencinin notunu goremesin. Ogretmen not girebilsin ve
		// ogrencinin gecip gecemedigini gorsun dersek
		// C01 class'inda varible access modifier'lari private yapariz ve
		//not icin setter; gecerMi icin getter olustururuz
		
		
		
		C01 ogr1 = new C01();

		ogr1.setNot(65);
		System.out.println(ogr1.isGecerMi());
	
	
	
	
	}

}
