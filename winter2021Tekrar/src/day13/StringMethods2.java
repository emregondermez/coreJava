package day13;

import java.util.Scanner;

public class StringMethods2 {

	public static void main(String[] args) {
		// length
		
		/*
		 kullanicidan bir String girmesini isteyin son harfini buyuk yazdirin
		 */
//		System.out.println("Please enter a sentence");
		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		
//		System.out.println(str.toUpperCase().charAt(str.length()-1));
//	//
		
		
		System.out.println("bir cumle giriniz");
		String str2 = scan.nextLine().toLowerCase();
		
		int sonuc = str2.indexOf("java");
		System.out.println(sonuc>=0 ? "Java var" : "java yok");
		
	
		
		scan.close();
	}

}
