package geometri2;

import java.util.Scanner;

public class Dikdortgen extends Kare {

	static double alanD;
	static double cevreD;
	static Scanner scan = new Scanner(System.in);
	


	public static void cevreDik() {
		System.out.println("dikdortgenin cevresini hesaplamak icin uzun kenari giriniz");
		double kenar1= scan.nextDouble();
		System.out.println("dikdortgenin cevre hesaplamak icin kisa kenari giriniz");
		double kenar2= scan.nextDouble();
		cevreD=(2*kenar1)+(2*kenar2);
		System.out.println("girdiginiz dikdortgenin cevresi = "+cevreD);
	}

	public static void alanDik() {
		System.out.println("dikdortgenin alanini hesaplamak icin uzun kenari giriniz");
		double kenar1= scan.nextDouble();
		System.out.println("dikdortgenin alanini hesaplamak icin kisa kenari giriniz");
		double kenar2= scan.nextDouble();
		alanD=kenar1*kenar2;
		System.out.println("Girdiginiz dikdortgenin alani = "+alanD);
	}
}
