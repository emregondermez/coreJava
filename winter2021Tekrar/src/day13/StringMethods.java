package day13;

public class StringMethods {

	public static void main(String[] args) {
		// concatenation
		String str1 = "Hello";
		String str2 = "World";

		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(" ").concat(str2)); // arada bosluk koyduk

		// charAt(index)
		String str3 = "Java Cok Guzel";
		System.out.println(str3.charAt(0)); // J
		System.out.println(str3.charAt(4)); // bosluk
		System.out.println("13  " + str3.charAt(13));

		// equals

		String str4 = "Ali Can";
		String str5 = "Ali Can";

		System.out.println(str4.equals(str5) ? "esittir" : "esit degildir");
		
		
		//equals ve cif  esittir farki
		
		String str6 = "Ali can";
		String str7= str6+ "";
		System.out.println(str6==str7);// false---> double equal hem adrese hem hem icerideki degere bakar
		System.out.println(str6.equals(str7));//true ----> icerigin ayni olmasi yeterlidir.
		
		
		
	}

}
