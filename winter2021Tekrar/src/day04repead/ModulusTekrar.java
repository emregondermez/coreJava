package day04repead;

import java.util.Scanner;

public class ModulusTekrar {

	public static void main(String[] args) {
		
		
	//kullanicidan 4 basamakli bir sayi alin ve rakamlari toplamini bulup yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("rakamlari toplamini istediginiz 4 basamakli bir sayi giriniz");
		int sayi = scan.nextInt();
		System.out.println("girdiginiz sayi: " + sayi);
		
		int birlerBas = sayi % 10;
		System.out.println("birler basamagi:" +birlerBas);
		
		sayi/=10;
		int onlarBas = sayi % 10;
		System.out.println("onlar basamagi: " + onlarBas);
		
		sayi/=10;
		int yuzlerBas= sayi %10;
		System.out.println("yuzler basmagi: " +yuzlerBas );
		
		sayi/=10;
		int binlerBas =sayi%10;
		System.out.println("binler basamagi: " +binlerBas);
		
		System.out.println("girdiginiz sayinin rakamlari toplami: " + (birlerBas + onlarBas + yuzlerBas + binlerBas));
		
		
		scan.close();
		
		
	
		
		
		
	}

}
