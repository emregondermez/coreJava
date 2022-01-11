package geometri2;

import java.util.Scanner;

public class Kare extends Cember {

	static double alanKare;
	static double cevreKare;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		alanKare();
		cevreKare();
	}
	public static void cevreKare() {
		System.out.println("Karenin cevresini bulmak icin bir kenar uzunlugunu giriniz. . ");
		double kenar= scan.nextDouble();	
		cevreKare=4*kenar;
		System.out.println("Karenin cevresi = "+cevreKare);
	}
	public static void alanKare() {
		System.out.println("Karenin alanini bulmak icin bir kenar uzunlugunu giriniz. . ");
		double kenar= scan.nextDouble();
		alanKare=kenar*kenar;
		System.out.println("girdiiniz karenin alani = "+alanKare);
	}
	
}
