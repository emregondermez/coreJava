package day02;

import java.util.Scanner;

public class Scanner_Day03 {

	public static void main(String[] args) {
		
		// kullanicidan isim soyisim isteyip
		// isim:  Ali
		// soyisim : Veli
		// kursumuza kaydiniz tamamlanmistir, teskkur ederiz
		// seklinde yazdirin
		

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz");
		String name = scan.nextLine();
		
		System.out.println("Lutfen soyisinizi giriniz");
		String surname = scan.nextLine();
		System.out.println("isim:"+name +' '+ "soyisim:"+surname);
		System.out.println( "kursumuza kaydiniz tammalnmistir, tesekkur ederiz");
		
		scan.close();
	}

}
