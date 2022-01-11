package day01;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		// Kullanicidan 2 tam sayi aliniz bu 2 tam sayinin 
		// 4 islem soncunu yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		System.out.print("1.sayi : ");
		int sayi1= scan.nextInt();
		
		System.out.print("2.sayiyi giriniz: ");
		int sayi2= scan.nextInt();
		
		System.out.println("Toplami: "+ (sayi1+sayi2)+"\n"
				+"Farki: "+(sayi1-sayi2)+"\n"
				+"Carpimi: "+(sayi1*sayi2)+"\n"
				+"Bolumu: "+((double)sayi1/sayi2));
		
		scan.close();
	}

}
