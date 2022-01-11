package day19_doWhileLoop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullanicdan bir cumle alin
		// cumlede buyuk harf var mi yok mu yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle = scan.nextLine();

		String flag = "yok";
		int index = 0;
		while (index < cumle.length()) {
			if (cumle.charAt(index) >= 'A' && cumle.charAt(index) <= 'Z') {
				flag = "var";

			}
			index++;
		}
		System.out.println("verdiginiz cumle de buyuk harf " + flag);
		scan.close();
	}
}
