package day36_Inheritance;

import day35_Encapsulation_Inheritance.Isci;

public class UstaBasi extends Isci {

	UstaBasi(){
		System.out.println("Usta basi parametresiz constructor calisti");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		UstaBasi ub1 = new UstaBasi();
		

		// java'da her class olusturuldugunda otomatik olarak default 
		// constructor olusturuldugu gibi 
		// child class'ta olusturulan her bir constructor'un ilk satirinda 
		// gizli super() olustrulur
		
	}

}
