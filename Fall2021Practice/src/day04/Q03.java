package day04;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {

// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
		// ceviren bir method yaziniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("cevrilecek birimi giriniz");
		String brm = scan.next();

		System.out.println("cevrilecek miktari giriniz");
		double mktr = scan.nextDouble();

		cevir(brm, mktr);

		scan.next();
	}

	private static void cevir(String brm, double mktr) {
		switch (brm) {
		case "saat":
			System.out.println("Girilen saatin samiye degeri = " + mktr * 3600+" saniye");
			break;
		case "mil":
			System.out.println("Girilen milin km degeri + " + mktr * 1.6+" km");
			break;
		case "kg":
System.out.println("Girilen kg nin gram dewgeri =  "+mktr*1000+" gram");
			break;
		default:
			System.out.println("gecerli bir birim giriniz");
		}

	}
}
