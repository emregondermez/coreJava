package day03;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		// Kullanıcıdan tek seferde alcaginiz 2 kelimelik ad soyadı 2 ayrı kelimeye
		// ayırınız,
		// ad ayrı soyad ayrı sekilde ekrana yazdırınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("adinizi ve soy adinizi arada bir bosluk birakarak yaziniz");
		String adSoyad = scan.nextLine();
		
		String isim= adSoyad.substring(0,adSoyad.indexOf(" "));
		
		String soyad =adSoyad.substring(adSoyad.indexOf(" ")+1);
		
		System.out.println(isim);
		System.out.println(soyad);
	
		
		
		
		scan.close();
	}
}
