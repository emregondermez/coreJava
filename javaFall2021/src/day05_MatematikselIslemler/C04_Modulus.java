package day05_MatematikselIslemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
		// Kullanicidan 4 basamakli bir sayi alip rakmalar toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi yaziniz");
		int sayi= scan.nextInt();
		
		int birler= sayi%10,
				onlar= sayi%100/10, 
				yuzler= sayi%1000/100, 
				binler= sayi%10000/1000;
	
		int rakamlarToplami= birler+onlar+yuzler+binler;
		System.out.println(rakamlarToplami);
		
		scan.close();
	}

}
