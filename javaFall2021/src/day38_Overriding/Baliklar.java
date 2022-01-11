package day38_Overriding;

public class Baliklar extends Animal {

	public static void main(String[] args) {
		

		
		Baliklar balik1 = new Baliklar();
		
		balik1.solunum(); //Baliklar solungaclariyla nefes alir
		balik1.hareket(); //Baliklar yuzerek hareket eder 
		balik1.beslenme(); //Hayavanlar beslenir
		
		
		
	}
	@Override
	public void hareket() {
		System.out.println("Baliklar yuzerek hareket eder");
	}
	@Override
	public void solunum() {
		System.out.println("Baliklar solungaclariyla nefes alir");
	}
	
}
