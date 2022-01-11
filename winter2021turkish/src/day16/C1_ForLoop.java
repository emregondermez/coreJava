package day16;

import java.util.Scanner;

public class C1_ForLoop {

	public static void main(String[] args) {
		// kullanicidan pozitif 2 tam sayi alin
		// aldigimiz degerlerden kucuk olandan baslayip buyuk olana kadar
		// tum sayilari yan yana (virgulle ayirarak) yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki tam sayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();

		int kucukSayi=0;
		int buyukSayi=0;
				
		
		if(sayi1<0 || sayi2<0) {
			System.out.println("Lutfen pozitif sayi giriniz");
		} else if (sayi1>sayi2){
			buyukSayi=sayi1;
			kucukSayi=sayi2;
		}else {
			buyukSayi=sayi2;
			kucukSayi=sayi1;
		}
		
		for (int i = kucukSayi; i <= buyukSayi ; i++) {
			System.out.print(i + ",");
		}
		
		
		scan.close();
	}

}
