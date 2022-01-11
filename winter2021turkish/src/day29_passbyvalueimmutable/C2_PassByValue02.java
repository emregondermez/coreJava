package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

	public static void main(String[] args) {
		/*
		 * Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun. -
		 * Method’da indirim uygulayip fiyati main method’da yazdirin - Method’lari arka
		 * arkaya cagirip dogru calistiklarini kontrol edin
		 */

		double fiyat = 100;

		yuzdeOn(fiyat);
		yuzdeYirmi(fiyat);
		yuzdeYirmiBes(fiyat);
		System.out.println("%10 indirimli fiyat " + yuzdeOn(fiyat));
		System.out.println("%20 indirimli fiyat " + yuzdeYirmi(fiyat));
		System.out.println("%25 indirimli fiyat " + yuzdeYirmiBes(fiyat));

	}

	public static double yuzdeYirmiBes(double fiyat) {
		fiyat *= 0.75;

		return fiyat;

	}

	public static double yuzdeYirmi(double fiyat) {
		fiyat *= 0.80;

		return fiyat;

	}

	public static double yuzdeOn(double fiyat) {
		fiyat *= 0.90;

		return fiyat;
	}

}
