package day19_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {

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

		 Scanner scan = new Scanner(System.in);
		 System.out.println("Lutfen bir sifre girin \n- Sifre kucuk harf icermelidir\r\n"
		 		+ " - Sifre buyuk harf icermelidir\r\n"
		 		+ " - Sifre ozel karakter icermelidir\r\n"
		 		+ " - Sifre en az 8 karakter olmalidir.");
		
		int sonuc =0;
		do {
			String sifre = scan.next();
			sonuc =kucukHarf(sifre)+buyukHarf(sifre)+ozelKrk(sifre)+krkSayisi(sifre);
			if (sonuc==4) {
				System.out.println("BASARILI");
			}else {
				System.out.println("\n =>> gecerli bir sifre giriniz <<==");
			}
			
		}while(sonuc!=4);
		
		
		scan.close();
	
	
	
	
	}

	public static int krkSayisi(String sifre) {
		int sonuc=0;
		if (sifre.length()>=8) {
			sonuc=1;
		} else {
			System.out.println("Sifre en az 8 karakter icermelidir");
		}
		return sonuc;
	}

	public static int ozelKrk(String sifre) {
		int sonuc=0;
		
		for (int i = 0; i < sifre.length() ; i++) {
			if (sifre.charAt(i)>='!' && sifre.charAt(i)<='/') {
				sonuc=1;
			}
		}if (sonuc==0) {
			System.out.println("Sifre en az 1 ozel karakter icermelidir");
		}
		return sonuc;
		
	}

	public static int buyukHarf(String sifre) {
		int sonuc=0;
		
		for (int i = 0; i < sifre.length() ; i++) {
			if (sifre.charAt(i)>='A'&& sifre.charAt(i)<='Z') {
				sonuc=1;
			}
		}if (sonuc==0) {
			System.out.println("Sifre en az 1 buyuk harf icermelidir");
		}
		return sonuc;
		
	}

	public static int kucukHarf(String sifre) {
		int sonuc=0;
		
		for (int i = 0; i < sifre.length() ; i++) {
			if (sifre.charAt(i)>='a'&& sifre.charAt(i)<='z') {
				sonuc=1;
			}
		}
		if (sonuc==0) {
			System.out.println("Sifre en az 1 kucuk harf icermelidir");
		}
		return sonuc;
		
	}

}
