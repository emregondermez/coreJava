package day12_StringManipulation2;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// indexOf() methodu bize istedigimiz karekterlerin index'ini dondurur.

		String str = "Java ogren, is sahibi ol";
		System.out.println(str.charAt(6));// g

		System.out.println(str.indexOf('g'));// 6

		System.out.println("char arama " + str.indexOf('g'));// 6
		System.out.println("String arama " + str.indexOf("g"));// 6
		System.out.println("String kelime arama " + str.indexOf("is"));
		System.out.println("birden fazla varsa " + str.indexOf('i')); // ILK BULDUGUNUN INDEX INI GETIRIR
		System.out.println("baslangic indexi ile " + str.indexOf('a', 4));

		System.out.println("bir cumle yaziniz");
		Scanner scan = new Scanner(System.in);
		String cumle = scan.nextLine().toLowerCase();
		
		int sonuc = cumle.indexOf("java");
		
		if(sonuc!=-1) {
			System.out.println("java var");
		}else {
			System.out.println("java yok");
		}
		
	scan.close();
	}

}
