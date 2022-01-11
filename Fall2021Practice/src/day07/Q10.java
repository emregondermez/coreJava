package day07;

import java.util.Scanner;

public class Q10 {
	/*
	 * Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
	 * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
	 * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
	 * harfi büyük yada küçüklüğüne duyarlıdır.) Sesli harfler: a,e,i,o,u Test Data:
	 * a Beklenen Çıktı: a harfi sesli harfdir. Test Data: d Beklenen Çıktı: d harfi
	 * sesiz harftir. Test Data: we yada % Beklenen Çıktı: Yanlis karakter girdiniz!
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		String harf = scan.next();
		String harfler = "A, B, C, D, E, F, G, H, I, K, L, M, N, O, P, Q, R, S, T, V, X, Y, Z".toLowerCase();
		String harflerB = "A, B, C, D, E, F, G, H, I, K, L, M, N, O, P, Q, R, S, T, V, X, Y, Z";
		String sesli = "aeiuo";
		String sesliB = "AEIUO";
	
		for (int i = 0; i < harf.length(); i++) {

			if (harf.length() > 1) {
				System.out.println("bir harf girin");
				break;
			} else if (sesli.contains(harf.substring(i, i + 1))) {
				System.out.println(harf + " harfi kucuk sesli harfdir");
			} else if (sesliB.contains(harf.substring(i, i + 1))) {
				System.out.println(harf + " harfi buyuk sesli harfdir");
			} else if (!harfler.contains(harf) || !harflerB.contains(harf)) {
				System.out.println("Yanlis karakter girdiniz!");
			}
		}
		scan.close();
	}
}
