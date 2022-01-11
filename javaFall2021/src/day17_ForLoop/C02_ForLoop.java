package day17_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {

	 	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi
		// tersten yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir yazi girin...");
		String str = scan.nextLine();

		//          E  M  R  E              
		// index    0  1  2  3    
		// length   1  2  3  4     
		
		//1.cozum
		String ters ="";
		
		for (int i = str.length()-1; i >=0; i--) {
			ters+=str.charAt(i);
		}
		System.out.println(ters);
		
		
		//2.cozum
		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.substring(i, i + 1));

			}
	
	 	scan.close();
	 	}

}
