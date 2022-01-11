package day17_ForLoop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan bir String alin ve bunu ntersten yazdiran bir method 
		// yazin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
		String str = scan.nextLine();
	
		System.out.println("girdiginiz String'in tersten yazimi : "+tersineCevir(str));
		
		System.out.println(terYazdir(str));
	
	
	//          E  M  R  E              
	// index    0  1  2  3    
	// length   1  2  3  4   
		
		
		scan.close();	
	}

	public static String tersineCevir(String str) {
		String ters="";
		for (int i = str.length()-1; i >=0; i--) {
			ters+=str.charAt(i);
		}
		
		return ters;
	}

	public static String terYazdir(String str) {
		
		String sonuc="";
		for (int i = str.length()-1; i >= 0; i--) {
			sonuc+=str.charAt(i);
		}
		
		
		return sonuc;
	}
	
}
