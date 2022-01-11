package day18;

import java.util.Scanner;

public class C3_WhileLoop3 {

	public static void main(String[] args) {
		// Kullanicidan baslangic ve bitis haflerini alin
		// ve baslangic harfinden baslayip bitis harfinde biten
		// tum harfleri buyuk harf olarak ekrana yazdirin.
		// Kullanicinin hata yapmadigini farz edin.
	
	
	System.out.println("lutfen baslangic harfini yaziniz ");
	Scanner scan= new Scanner(System.in);
	char b = scan.next().toUpperCase().charAt(0);
	System.out.println("lutfen bitis harfini giriniz");
	char s = scan.next().toUpperCase().charAt(0);
	
	
	
	while (b<=s) {
		System.out.print(b+ " ");
		
		b++;
	}
	
	
	scan.close();
	}

}
