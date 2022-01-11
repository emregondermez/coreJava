package day18_NestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
	/*
	 Kullanicidan toplamak uzere sayilar isteyin 
	 sayi adedi 10'u veya sayilar toplami 500'u gecerse 
	 "Bu kadar sayi yeter"
	 ... adet sayi girdiniz toplami ... yazdirin
	 */
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen toplamk uzere sayilar giriniz ");
	
	int sayi=0;
	int toplam=0;
	int sayac=0;
	
	
	while(sayac<10 && toplam<=500) {
		System.out.println("sayi gir");
		sayi=scan.nextInt();
		sayac++;
		toplam+=sayi;
	}System.out.println(sayac+" adet sayi girdiniz bu sayilarin toplami "+toplam);
	
	
	
	scan.close();
	}

}
