package day33_encapsulation;

import day21_Scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		// OOP concept
		// Object Oriented Programming
		// bir proje kapsamindaki class'larda olustururlan variable ve method'larin
		// baska class'larda tekrar tekrar yazilmamasi, var oldugu class'tan obje uretilerterek
		// bu variable ve methodlarin istenildigi kadar kullanilmasidir. (re-usability)
		// write Once Reuse Anywhere
		
		// Scope6 class'indaki variable metodlarina ulasmak istiyorum
		// bunun icin Scope6 class'indan obje uretmeliyiz
		
		Scope6 obj1 = new Scope6();
		obj1.num1=10;
		System.out.println(obj1.num1);
	 
	}

}
