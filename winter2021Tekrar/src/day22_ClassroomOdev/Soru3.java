package day22_ClassroomOdev;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		/*
		 * “NestedIfStatements” class olusturun.
		 
		 * Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
		 * 
		 * Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak kimin yas olarak
		 * daha buyuk oldugunu ekrana yazdirin. Examples: int birthYearOfYusuf=2000,
		 * birthMonthOfYusuf=12, birthDayOfYusuf=12, int
		 * birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21; Yusuf is
		 * Older
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("yaslarini karsilastirmak istediginiz kisilerin adlarini giriniz ");
		System.out.println("1. kisi :");
		String kisi1 = scan.nextLine();
		System.out.println("2. kisi :");
		String kisi2 = scan.nextLine();

		// 1.kisi yas
		System.out.println(kisi1 + "'in dogum yilini giriniz");
		int kisi1Yil = scan.nextInt();
		System.out.println(kisi1 + "'in dogdugu ay numarasini giriniz");
		int kisi1Ay = scan.nextInt();
		System.out.println(kisi1 + " ayin hangi gunu dogdu?");
		int kisi1Gun = scan.nextInt();

		// 2.kisi yas
		System.out.println(kisi2 + "'in dogum yilini giriniz");
		int kisi2Yil = scan.nextInt();
		System.out.println(kisi2 + "'in dogdugu ay numarasini giriniz");
		int kisi2Ay = scan.nextInt();
		System.out.println(kisi2 + " ayin hangi gunu dogdu?");
		int kisi2Gun = scan.nextInt();

		// if statement

		if (kisi1Yil == kisi2Yil) {
			if (kisi1Ay < kisi2Ay) {
				System.out.println(kisi1 + " " + kisi2 + "'den daha buyuktur");
			} else if (kisi1Ay > kisi2Ay) {
				System.out.println(kisi2 + " " + kisi1 + "'den daha buyuktur");
			} else if (kisi1Ay == kisi2Ay) {
				if (kisi1Gun < kisi2Gun) {
					System.out.println(kisi1 + " " + kisi2 + "'den daha buyuktur");
				} else if (kisi1Gun > kisi2Gun) {
					System.out.println(kisi2 + " " + kisi1 + "'den daha buyuktur");
				} else {
					System.out.println(kisi1 + " ve " + kisi2 + " ayni gun ayni ay ve ayni yil dogmustur");
				}
			}

		} else if (kisi1Yil < kisi2Yil) {
			System.out.println(kisi1 + " " + kisi2 + "'den daha buyuktur");
		} else {
			System.out.println(kisi2 + " " + kisi1 + "'den daha buyuktur");
		}

		scan.close();
	}

}
