package day16;

import java.util.Scanner;

public class C4_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan pozitif bir sayi alin 1'den kullanicin
		// girdigi sayiya kadar tum sayilarin toplamini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen pozitif bir sayi giriniz");
		int a = scan.nextInt();

		int toplam = 0;

		if (a < 1) {
			System.out.println("lutfen pozitif bir sayi giriniz");

		} else {
			for (int i = 1; i <= a; i++) {
				toplam += i;
			}
			System.out.println(toplam);

		}
  
		scan.close();
	}

}
