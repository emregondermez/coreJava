package day19_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		 /*
        Soru 5 ) Kullanicidan bir sifre girmesini isteyin. 
        Girilen sifreyi asagidaki sartlara gore kontrol edin 
        ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin 
        ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
     
       - Sifre kucuk harf icermelidir
       - Sifre buyuk harf icermelidir
       - Sifre ozel karakter icermelidir
       - Sifre en az 8 karakter olmalidir.
        */
	
	Scanner scan = new Scanner (System.in);
	System.out.println("- Sifre kucuk harf icermelidir\r\n"
			+ "- Sifre buyuk harf icermelidir\r\n"
			+ "- Sifre ozel karakter icermelidir\r\n"
			+ "- Sifre en az 8 karakter olmalidir.");

	int sonuc=0;
	
	
		do {
			String sifre = scan.next();
		
			sonuc = kucuk(sifre)+ buyuk(sifre)+ ozel(sifre)+karakter(sifre);
			
			if (sonuc==4) {
				System.out.println("BASARDIN ");
			}else {
				System.out.println("Lutfen talimatlara uygun bir sifre giriniz !");
			}
			
		}while(sonuc!=4);
	
	
	
	scan.close();
	
	}

	public static int karakter(String sifre) {
		int sonuc=0;
		if (sifre.length()>=8) {
			sonuc=1;
		} else {
			System.out.println("8 dedik kardes saymayi mi bilmiyorsun ?");
		}
		return sonuc;
	}

	public static int ozel(String sifre) {
		int sonuc=0;
		for (int i = 0; i < sifre.length(); i++) {
			if (sifre.charAt(i)>='!' && sifre.charAt(i)<='/') {
				sonuc=1;
			}
		}if (sonuc==0) {
			System.out.println("ozel karakter yok !");
		}
		
		return sonuc;
		
	}

	public static int buyuk(String sifre) {
		int sonuc=0;
		for (int i = 0; i < sifre.length(); i++) {
			if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z') {
				sonuc=1;
			}
		}if (sonuc==0) {
			System.out.println("buyuk karakter yok !");
		}
		
		return sonuc;
		
	}

	public static int kucuk(String sifre) {
		int sonuc=0;
		
		for (int i = 0; i < sifre.length(); i++) {
			if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z') {
				sonuc=1;
			}
		
		}if (sonuc==0) {
			System.out.println("kucuk karakter yok !");
		}
		
		return sonuc;
	}

}
