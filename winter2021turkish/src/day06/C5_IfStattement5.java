package day06;

import java.util.Scanner;

public class C5_IfStattement5 {

	public static void main(String[] args) {
		//kullanicidan bir dikdortgenin iki kenar uzunlugunu alin
		//kenar  uzunluklari esitse kare degilse dikdortgen yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("dortgenin kenar uzunluklarindan birini giriniz");
		double kenar01 = scan.nextDouble();
		
		System.out.println("dortgenin diger kenarini giriniz");
		double kenar02 = scan.nextDouble();
		
		if (kenar01>0 && kenar02>0 && kenar01 != kenar02) {
			System.out.println("dikdortgen");
			
		}
		
		if( kenar01>0 && kenar02>0 && kenar01 == kenar02) {
			System.out.println("kare");
		}
	
		if (kenar01<= 0 || kenar02<=0 ) {
			System.out.println("lutfen gecerli bir uzunluk giriniz");
			
		}
		scan.close();
	}
	
	

}
