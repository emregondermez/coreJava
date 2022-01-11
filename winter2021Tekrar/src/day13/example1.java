package day13;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		// kulaniciya cinsiyetini sorunuz 
		// 18 yasidan buyuk erkek ise yetiskin erkek - kadinsa yetiskin kadin
		//18 den kucuk erkek ise genc erkek -- kadin ise genc kadin yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("cinsiyetinizi giriniz");
		String cinsiyet= scan.nextLine().toLowerCase();
		System.out.println("yasinizi giriniz");
		int yas = scan.nextInt();
		
		if (cinsiyet.equals("erkek")) {
			if (yas<18) {
				System.out.println("genc erkek");
			} else {
				System.out.println("yetiskin erkek");
			}
			
			
		} else if(cinsiyet.equals("kadin")) {
			if (yas<18) {
				System.out.println("genc kadin");
			} else {
				System.out.println("yetiskin kadin");
			}
			
			
		}else {
			System.out.println("gercerli bir cinsiyet giriniz");
		}
		
	scan.close();	
	}

}
