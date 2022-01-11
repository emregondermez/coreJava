package day11_StringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		// indexOf();  Parametre olarak girilen bir char veya String'in 
		// ilk index'ini verir
		
		String str1= "Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str1.indexOf("J"));
		System.out.println(str1.indexOf("Java"));
		
		System.out.println(str1.indexOf("Lale")); // olmayan karakter veya kelime de -1 doner
		System.out.println(str1.indexOf("a", 78));
	
	
	}

}
