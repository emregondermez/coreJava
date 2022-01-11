package day17_ForLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		/*
		 * Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den
		 * baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak; - Sayi 3’un
		 * kati ise sayi yerine “Java” yazdirin. - Sayi 5’in kati ise sayi yerine
		 * “Guzeldir” yazdirin. - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java
		 * Guzeldir” yazdirin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 100'den kucuk bir sayi giriniz...");
		int num = scan.nextInt();

		if (num < 0 || num > 100) {
			System.out.println("Lutfen gecerli bir sayi giriniz");
		} else {
			for (int i = 1; i <= num; i++) {

				if (i % 15 == 0) {
					System.out.println("Java Guzeldir");
				} else if (i % 3 == 0) {
					System.out.println("Java");
				} else if (i % 5 == 0) {
					System.out.println("Guzeldir");
				} else {
					System.out.println(i);
				}
			}
		}

		scan.close();
	}

}
