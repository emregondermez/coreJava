package day16;

import java.util.Scanner;

public class C6_ForLoop {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 100'den kucuk bir tamsayi isteyin 1'den baslayarak girilen tam
		 * sayiya kadar tum saayilari yazdirin.Ancak; -sayi ucun kati ise sayi yerine
		 * "java" -sayi 5'in katiysa sayi yerine "guzeldir" -sayi ikisinin de kati ise
		 * sayi yerine "Java guzeldir" yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen  100'den kucuk pozitif bir sayi giriniz");
		int sayi = scan.nextInt();

		if (sayi <= 100 && sayi > 0) {
			for (int i = 1; i <= sayi; i++) {
				if (i % 15 == 0) {
					System.out.print(" Java guzeldir ");
				} else if (i % 5 == 0) {
					System.out.println(" guzeldir ");
				} else if (i % 3 == 0) {
					System.out.print(" java ");
				} else {
					System.out.print(i + "- ");
				}
			}
		} else {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		}

		scan.close();
	}

}
