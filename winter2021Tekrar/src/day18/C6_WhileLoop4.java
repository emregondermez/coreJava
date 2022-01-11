package day18;

import java.util.Scanner;

public class C6_WhileLoop4 {

	public static void main(String[] args) {
//	    Kullanicidan bir rakam alin ve bu rakam icin garpim tablosunu ekrana
//		yazdirin. Kullanicinin hata yapmadigini farz edin.
//		Ornegin kullanici 3 girerse;
//		3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27
//		3x10=30
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("carpim taplosu olusturmak icin bir rakam giriniz");
		int rakam= scan.nextInt();
		
		if (rakam<=10 && rakam>0) {
			
			int baslangic=1;
			
			while(baslangic<=10) {
				System.out.println(baslangic+" x "+rakam+" = "+(baslangic*rakam));
				
				baslangic++;
			}
		} else {
			System.out.println("lutfen pozitif bir rakam giriniz");
		}
scan.close();
	}

}
