package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary {

	public static void main(String[] args) {
		
		// kullanicidan dortgenin uzunluklarini alin 
		// kae mi dikdortgen mi oldugunu yazdirin

		
		System.out.println("uzunluklari sira ile giriniz");
		Scanner scan = new Scanner(System.in);
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		//System.out.println(kenar1==kenar2 ? "kare" : "kare degil");
		
		System.out.println(kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "kare degil") : "gecersiz uzunluk");
		
		String sonuc =kenar1>0 && kenar2>0 ? (kenar1==kenar2 ? "kare" : "kare degil") : "gecersiz uzunluk" ;
		System.out.println(sonuc);
		
		
		scan.close();
	}

}
