package day17_ForLoop;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		
	// Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in palindrome olup olmadigini 
	//kontrol eden bir program yazin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
		String str = scan.nextLine();
	
        //      E  M  R  E              
	// index    0  1  2  3    
	// length   1  2  3  4     
	
		String tersi="";
		for (int i = str.length()-1; i >=0; i--) {
			tersi+=str.substring(i,i+1);
		}
		
		
		if (str.equals(tersi)) {
			System.out.println("palindrome");
		} else {
			System.out.println("palindrome degil ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	
//	if (str.equals(terYazdir(str))) {
//		System.out.println("Girdiginiz kelime Palindrome");
//	} else {
//		System.out.println("Girdiginiz kelime Palindrome DEGIL");
//	}
		
		
	scan.close();	
	}

	public static String terYazdir(String str) {
		String sonuc="";
		for (int i = str.length()-1; i >= 0; i--) {
			sonuc+=str.charAt(i);
		}
		
		
		return sonuc;
	}
	
}
