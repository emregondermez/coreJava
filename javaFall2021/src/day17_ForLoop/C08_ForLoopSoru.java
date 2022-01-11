package day17_ForLoop;

import java.util.Scanner;

public class C08_ForLoopSoru {

	public static void main(String[] args) {
		/*
        * Problem Tanımı Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        * Hatırlatma C(n,r) = n! / (r!(n-r)!) Verilen iki sayının permütasyonunu bulan
        * kodu yazınız. Hatırlatma P(n,r) = n! / (n-r)! Ekran Çıktısı Birinci sayıyı
        * giriniz: 15 Ikinci sayıyı giriniz: 4 Kombinasyon: 1365 permütasyon: 32760
        * Birinci sayıyı giriniz: 5 Ikinci sayıyı giriniz: 3 Kombinasyon: 10
        * permütasyon: 60
        */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		System.out.print("sayi 1 : ");
		int sayi1=scan.nextInt();
		System.out.print("sayi 2 : ");
		int sayi2=scan.nextInt();
		
		int buyuk=0;
		int kucuk=0;
		
		if (sayi1<0 || sayi2<0) {
			System.out.println("Negatif sayilarala islem yapamazsin");
		} else if(sayi1>sayi2){
			buyuk=sayi1;
			kucuk=sayi2;
			
		}else {
			buyuk=sayi2;
			kucuk=sayi1;
		}
		
		int fark =buyuk-kucuk;
		
		
		
		
		kombinasyon(buyuk,kucuk,fark);
		permutasyon(buyuk,fark);
		   
	scan.close();	   
	}

	public static void permutasyon(int buyuk, int fark) {
		int sonuc= faktoriyel(buyuk)/faktoriyel(fark);
		System.out.println("permutasyon = "+sonuc);
	}

	public static void kombinasyon(int buyuk, int kucuk,int fark) {
		int sonuc=faktoriyel(buyuk)/(faktoriyel(kucuk)*faktoriyel(fark));
		   System.out.println("kombinasyon = "+sonuc);
		
	}

	public static int faktoriyel(int sayi1) {
		int f=1;
		for (int i = sayi1; i >=1; i--) {
			f*=i;
		}
		return f;
	}

}
