package day29_passbyvalueimmutable;

public class C1_PassByValue {

	public static void main(String[] args) {
		/*
		 * Verilen bir fiyat icin %10 indirim yapan bir method olusturun. - Method’da
		 * indirim uygulanan fiyati yazdirin - Method Call sonrasi original fiyati
		 * yazdirin ve method’da yapilan degisikligin orginal degeri degistirip
		 * degistirmedigini kontrol edin.
		 */

		int fiyat = 100;

		yuzde10(fiyat);

	}

	public static void yuzde10(int fiyat) {
		System.out.println("%10 indrimli fiyat = " + (fiyat = fiyat - (fiyat / 10)) + " TL");

	}

}
