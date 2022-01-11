package day19;

import java.util.Scanner;

public class SifreSorusu {

	public static void main(String[] args) {
//		kullanicidan bir sifre girmesini isteyin 
//		 girilen sifrteyi asagidaki sartlara gore kontrol edin ve kullanici 
//		gecerli bir sifre girene kadar bu islemi tekrar ettirin
//		ve gecerli sifre girdiginde sifreniz kabul edilmistir yazdirin
//		->sifre kucuk harf icermelidir
//		->buyuk harf icermelidir
//		->ozel karakter icermelidir
//		->sifre en az 8 karakter olmalidir

	 Scanner scan = new Scanner (System.in);
	 String sifre="";
	int sonuc=0;
	
	
	 do {
		 System.out.println("lutfen sifrenizi giriniz");
		 sifre= scan.nextLine();
		 
		 
	 sonuc =kucukHarfVarMi(sifre) + buyukHarfVarMi(sifre) +ozelKarakterVarMi(sifre)+uzunlukYeterliMi(sifre);
	
	 }while( sonuc!=4); 
	 	System.out.println("sifreniz basari ile kaydedildi");
		
		
		
		
		scan.close();
	}

	public static int uzunlukYeterliMi(String sifre) {
		int flagUzunluk=0;
		if (sifre.length()>=8) {
			flagUzunluk=1;
		} else {
			System.out.println("sifre en az 8 karakter icermelidir!");
		}		
		return flagUzunluk;
	}

	public static int ozelKarakterVarMi(String sifre) {
		int flagOzel = 0;
		int index = 0;
		while (index < sifre.length()) {
			if (sifre.charAt(index)>=' ' && sifre.charAt(index)<='/') {
				flagOzel=1;
			}
		index++;
		}if (flagOzel==0) {
			System.out.println("sifre en az bir ozel karakter icermelidir");
		}
	return flagOzel;
	}

	public static int buyukHarfVarMi(String sifre) {
		int flagBuyuk=0;
		for (int i = 0; i < sifre.length(); i++) {
			if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z') {
				flagBuyuk=1;
			}
		
		}if (flagBuyuk==0) {
			System.out.println("sifre en az bir buyuk harf icermelidir");
		}
		return flagBuyuk;
	}// method sonu

	public static int kucukHarfVarMi(String sifre) {
		int index = 0;
		int flagKucuk = 0;
		while (index < sifre.length()) {
			if (sifre.charAt(index) > 'a' && sifre.charAt(index) < 'z') {
				flagKucuk = 1;
			}
			index++;
		}
		if (flagKucuk == 0) {
			System.out.println("sifre kucuk harf icermelidir");
		}
		return flagKucuk;
	}// metod sonu

}
