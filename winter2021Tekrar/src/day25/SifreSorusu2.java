package day25;

import java.util.Scanner;

public class SifreSorusu2 {
//	kullanicidan bir sifre girmesini isteyin 
//	 girilen sifrteyi asagidaki sartlara gore kontrol edin ve kullanici 
//	gecerli bir sifre girene kadar bu islemi tekrar ettirin
//	ve gecerli sifre girdiginde sifreniz kabul edilmistir yazdirin
//	->sifre kucuk harf icermelidir
//	->buyuk harf icermelidir
//	->ozel karakter icermelidir
//	->sifre en az 8 karakter olmalidir

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Sifre en az bir buyuk harf bir kucuk harf bir ozel karakter icermeli ve en az 8 karakterden olusmalidir");

		String sifre = "";
		int onay = 0;

		do {
			System.out.println("lutfen gecerli bir sifre giriniz");
			sifre = scan.next();

			onay = kucukHarf(sifre) + buyukHarf(sifre) + ozelKarakter(sifre) + sifreUzunluk(sifre);

		} while (onay != 4);
		System.out.println("sifre kaydedildi");

	scan.close();
	}

	public static int sifreUzunluk(String sifre) {
		int sonuc = 0;
		if (sifre.length() >= 8) {
			sonuc = 1;
		} else {
			System.out.println("sifre en az 8 karakter olmalidir");
		}

		return sonuc;
	}

	public static int ozelKarakter(String sifre) {
		int sonuc = 0;
		for (int i = 0; i < sifre.length() - 1; i++) {
			if (sifre.charAt(i) >= ' ' && sifre.charAt(i) <= '/') {
				sonuc = 1;
			}
		}
		if (sonuc != 1) {
			System.out.println("sifre en az bir ozel karakter icermelidir");
		}

		return sonuc;
	}

	public static int buyukHarf(String sifre) {
		int sonuc = 0;
		for (int i = 0; i < sifre.length() - 1; i++) {
			if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
				sonuc = 1;
			}
		}
		if (sonuc != 1) {
			System.out.println("sifre en az bir buyuk harf icermelidir");
		}
		return sonuc;
	}

	private static int kucukHarf(String sifre) {
		int sonuc = 0;
		int index = 0;
		while (index < sifre.length() - 1) {
			if (sifre.charAt(index) >= 'a' && sifre.charAt(index) <= 'z') {
				sonuc = 1;
			}
			index++;
		}
		if (sonuc != 1) {
			System.out.println("sifre en az bir kucuk harf icermelidir");
		}

		return sonuc;
	}

}
