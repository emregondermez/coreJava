package day03;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {

	/*
	 * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
	 * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
	 * Test data: ali eme all
	 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 harfli bir isim yaziniz");
		String isim = scan.nextLine();
		
		char c1= isim.charAt(0);
		char c2= isim.charAt(1);
		char c3= isim.charAt(2);
		
		
		if (isim.length()==3) {
			if (c1!=c2 && c2!=c3 && c1!=c3) {
				System.out.println("girilen isim 3 harfli ve uniq");
			} else {
				System.out.println("girilen isim 3 harfli ama uniq degil");
			}
			
		} else {
			System.out.println("lutfen 3 harfli bir isim giriniz");
		}
		
		System.out.println(">>>>>> Ternary Sonuc <<<<<<<<");
		String sonuc = isim.length()==3 ? (c1!=c2 && c2!=c3 && c1!=c3 ? "girilen isim 3 harfli ve uniq"
				:"girilen isim 3 harfli ama uniq degil"):("lutfen 3 harfli bir isim giriniz");
		
		System.out.println(sonuc);
		
		
		scan.close();
		
		
	}
}