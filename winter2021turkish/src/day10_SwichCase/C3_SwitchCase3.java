package day10_SwichCase;

import java.util.Scanner;

public class C3_SwitchCase3 {

	public static void main(String[] args) {
		// kullanicdan hangi gunde oldugumuzu isteyin
		// girilen gunun hafatasonu/haftaici oldugunu yazdirin

		System.out.println("hangi gun ?");
		Scanner scan = new Scanner(System.in);
		String gun = scan.nextLine().toLowerCase();

		switch (gun) {
		case "pazar":
		case "cumartesi":
			System.out.println("hafta sonu");
		break;
		case "pazartesi" :
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("hafta ici");
			break;
		default:
			System.out.println("gecerli bir gun giriniz");

		}
scan.close();
	}

}
