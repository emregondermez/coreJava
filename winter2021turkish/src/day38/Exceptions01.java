package day38;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi alin ve bolumlerini yaazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bolunecek sayiyi yaziniz");
		int sayi = scan.nextInt();
		System.out.println("kaca bolmek istediginizi yaziniz");
		int sayi2 = scan.nextInt();
		// java exceptions'i handle etmek icin try-catch blogu olusturmustur

		try {
			System.out.println("bolme islemeinin sonucu = " + (sayi / sayi2));
		} catch (ArithmeticException e) {
			System.out.println("sayiyi sifira bolemezsin");
		}

		scan.close();
	}

}
