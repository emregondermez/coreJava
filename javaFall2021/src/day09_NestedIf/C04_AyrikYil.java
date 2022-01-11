package day09_NestedIf;

import java.util.Scanner;

public class C04_AyrikYil {

	public static void main(String[] args) {
		/* Kullanicidan artik yil olup olmadigini kontrol etmek
		icin yil girmesini isteyin
		Kural1: 4 ile bolunemeyen yillar artik yil degildir
		Kural2: 4 ile bolunup 100 ile bolunemeyen yillar artik
		yildir
		Kural3: 4 ’un kati olmasina ragmen 100 ile bolunebilen
		yillardan sadece 400 ’un kati olan yillar artik
		yildir
	*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("ayrik yil olup olmadigini ogrenmek icin bir yil giriniz. . . ");
		int year = scan.nextInt();
		

		if (year%100==0) {
			
			if (year%400==0 ) {
				System.out.println("Ayrik yil");
			} else {
				System.out.println("Ayrik yil degil");
			}
			
		} else {
			
			if (year%4==0) {
				System.out.println("ayrik yil");
			} else {
				System.out.println("Ayrik yil degil");
			}
		

		}
		
		
		scan.close();
		
	}

}
