package day05_MatematikselIslemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
		
		// kullanicidan 3 basamakli bir sayi alip rakamlar toplamini yazdiran 
		// bir program yaziniz
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int sayi1= scan.nextInt();
		
		int birler= sayi1%10, onlar= sayi1%100/10, yuzler= sayi1%1000/100;
		
		System.out.println(birler+onlar+yuzler);
	
	
	scan.close();
	}

	
}
