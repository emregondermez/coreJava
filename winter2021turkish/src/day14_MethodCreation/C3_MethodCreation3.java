package day14_MethodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// verilen 3 double sayinin ortalamasini alaan bir method yazin
		// main method icinden cagirarak methodu calistirin

		double a1 = 5.98;
		double a2 = 89.9;
		double a3 = 78.87;

		ortalama(a1, a2, a3);

	}

	public static void ortalama(double sayi1, double sayi2, double sayi3) {

		System.out.println("girdiginiz uc sayinin ortalamasi: " + (sayi1 + sayi2 + sayi3) / 3);

	}

	public static void ortalama(double sayi1, double sayi2) {

		System.out.println("girdiginiz iki sayinin ortalamasi: " + (sayi1 + sayi2) / 2);

	}

}
