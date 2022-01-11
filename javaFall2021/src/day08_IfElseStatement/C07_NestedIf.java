package day08_IfElseStatement;

import java.util.Scanner;

public class C07_NestedIf {

	public static void main(String[] args) {
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli
		// olabilir, calisan erkekse 65 yasindan buyukse emekli olabilir

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cinsiyetinizi giriniz erkekse E, kadinsa K");
		char gender = scan.next().toUpperCase().charAt(0);

		System.out.print("Lutfen yasinizi giriniz : ");
		double age = scan.nextDouble();

		if (gender == 'E') {
			
				if (age >= 65) {
				System.out.println("Emekli olabilirsin");
				} else {
				System.out.println("Emekli olamazsin");
				}

		} else if (gender == 'K') {
			
				if (age >= 65) {
				System.out.println("Emekli olabilirsin");
				} else {
				System.out.println("Emekli olamazsin");
				}

		} else {
			System.out.println("Lutfen gecerli bir cinsiyet girin");
		}

		scan.close();
	}

}
