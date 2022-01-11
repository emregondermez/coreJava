package day13_StringManipulation;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		
		String satir = "*Java 98ogrenmek c..ok k876olay";
		System.out.println(satir);
		System.out.println(satir.replaceAll("\\s","-")); // --->  \\s bosluklarin hepsi
		System.out.println(satir.replaceAll("\\S", "*")); // ---> \\S bosluk disindaki hepsi
		System.out.println(satir.replaceAll("\\d", "")); // --->  \\d tum sayilar
		System.out.println(satir.replaceAll("\\D", ""));// --->  \\D sayilar haricindeki hepsi
		System.out.println(satir.replaceAll("\\w", "")); // --->  \\w tum harfler
		System.out.println(satir.replaceAll("\\W", "")); // --->  \\W harfler ve rakamlar haric hepsi
		
		
	System.out.println(satir.replaceAll("[a-zA-Z]", "*"));
		

	}

}
