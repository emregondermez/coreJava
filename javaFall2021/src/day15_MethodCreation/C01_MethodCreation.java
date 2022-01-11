package day15_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan isiim ve soy ismini isteyin
		// iki farkli method olusturun
		// methodlardan biri kelimeleri
		// 1. method ilk harf buyuk digerleri kucuk olacak sekilde birlestirsin
		// 2. method ilk hafler buyuk geri kalani * olacak sekilde birlestirsin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen isim ve soy isminizi giriniz");
		String isim = scan.nextLine();
		
		buyuk(isim);
		System.out.println(buyuk(isim));
		yildiz(isim);
		System.out.println(yildiz(isim));
	
	scan.close();
	}

	public static String yildiz(String isim) {
		
		String yildizli=isim.toUpperCase().charAt(0)+isim.substring(1,isim.indexOf(" ")).replaceAll("\\w","*")
				+" "+isim.toUpperCase().charAt(isim.indexOf(" ")+1)+isim.substring(isim.indexOf(" ")+2,isim.length()).replaceAll("\\w", "*");
	
		return yildizli;
	}

	public static String buyuk(String isim) {
		String bHarf=isim.toUpperCase().charAt(0)+isim.substring(1,isim.indexOf(" ")).toLowerCase()
		+" "+isim.toUpperCase().charAt(isim.indexOf(" ")+1)+isim.substring(isim.indexOf(" ")+2,isim.length()).toLowerCase();
		
		return bHarf;
	}

}
