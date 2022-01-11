package day21;

public class Scope2 {

	public static void main(String[] args) {
		//static variable icin obje olusturmaya gerek yoktur
		// baska bir class dan static variable lara ulasmak istedigimizde 
		// ulasmak istedigimiz class adi.static variable adi yazmamiz yetrlidir
		
		
		System.out.println(Scope1.okulAdi);
		
	
		Scope1.okulAdi="emre koleji";
		System.out.println(Scope1.okulAdi);
		
	}

}
