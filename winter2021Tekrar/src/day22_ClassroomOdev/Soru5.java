package day22_ClassroomOdev;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/*
		 * Kullanıcını 1 ile 7 arasında bir sayı girdiğinde haftanın hangi günü olduğunu
		 * yazdıran switch case java kodunu yazinız.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("gun secmek icin 1 ile 7 arasinda bir rakam giriniz");
		int gun = scan.nextInt();

		switch (gun) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persembe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
		default:
			System.out.println("lutfen gecerli bir deger giriniz");
			break;
		}
		scan.close();
	}

}
