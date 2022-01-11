package day03scanner;

import java.util.Scanner;


public class Scanner05 {

	public static void main(String[] args) {
		// kullanicidan ismini isteyip ilk harfini buyuk yazdirin
		// mehmet: bashafiniz = M
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen Adinizi Giriniz");

		char ilkHarf = scan.next().toUpperCase().charAt(0);
		System.out.println("inital = " + ilkHarf);
		
		scan.close();
		
		
		
		
		
		
		
		
	}

}
