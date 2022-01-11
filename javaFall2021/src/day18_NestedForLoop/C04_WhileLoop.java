package day18_NestedForLoop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan toplamak uzere sayilar isteyin 
		// Kullanici 0'a basana kadar toplamaya devam edin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("toplamak istediginiz sayilari yazin sonra 0'a basin . . .");
		
		int sayi=1;
		int toplam=0;
		int sayac=0;
		
		while(sayi!=0) {
			System.out.println("sayi girin");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
		}System.out.println("Girdiginiz "+(sayac-1)+" adet sayinin toplami = "+toplam);
		
		scan.close();
	}

}
