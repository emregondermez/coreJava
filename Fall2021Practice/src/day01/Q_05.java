package day01;

import java.util.Scanner;

public class Q_05 {

	public static void main(String[] args) {
		
		// ---> !! EKSIK COZUM !!
		
		/*
		 * Problem Tanımı Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
		 * Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu
		 * ortalama 120 km/saat hızla giden bir araç ne kadar sürede hedefe varır? Örnek
		 * Ekran Çıktısı Mesafeyi giriniz: 400 Hızı giriniz: 100 Süre 4 saattir.
		 * FORMUL-> hiz=yol/zaman
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen sureyi hesaplamak icin mesafeyi ve hizinizi giriniz ");
		System.out.print("mesafe (km): ");
		double mesafe = scan.nextDouble();
		System.out.print("hiziniz (kmh) : ");
		double hiz = scan.nextDouble();

		double sure = mesafe / hiz;
		int saat= (int)sure;
		
		double dk = (sure-saat)*60;

		System.out.println(saat +" saat " +(int)dk+ " dk sonra varacaksiniz");

		scan.close();
	}

}
