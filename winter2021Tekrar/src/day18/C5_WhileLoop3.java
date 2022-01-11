package day18;

import java.util.Scanner;

public class C5_WhileLoop3 {

	public static void main(String[] args) {
//		Kullanicidan baslangic ve bitis haflerini alin ve 
//		baslangig harfinden baslayip
//		bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
//		yapmadigini farz edin.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir baslangic harfi giriniz");
		char bHarf = scan.next().toUpperCase().charAt(0);
		System.out.println("son harfi giriniz");
		char sHarf = scan.next().toUpperCase().charAt(0);

		while(bHarf<=sHarf) {
			System.out.print(bHarf+" ");
			bHarf++;
		}
	scan.close();	
	}

}
