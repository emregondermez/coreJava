package day11_StringManipulation;

public class C1_Concatenation {

	public static void main(String[] args) {
		// concatenation : Java 'da + islemi yapilirken eger toplanan ifadelerden biri veya 
		//ikisi String ise Java toplama degil birlestirme yapar.
		
		String str1= "Hello";
		String str2 ="World";
		//Hello world yazdirmak istersek
		System.out.println(str1+" "+str2);
		
		// str1.concat(str2) methodu str1ín sonuna str2'yi ekler
		System.out.println(str1.concat(str2));// HelloWorld
		
		System.out.println(str1.concat(" ").concat(str2)); // Hello World
	
	
	
	
	}

}
