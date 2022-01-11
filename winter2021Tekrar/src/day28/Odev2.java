package day28;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		/*
		 * Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java
		 * kodunu yaziniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Kac gun icerdigini ogrenmek istediginiz ayi giriniz");
		String ay = scan.next().toLowerCase();

		switch (ay) {
		case "ocak":
		case "mart":
		case "mayis":
		case "temmuz":
		case "agustos":
		case "ekim":
		case "aralik":
			System.out.println(ay + " ayi 31 gun icerir");
			break;
		case "nisan":
		case "haziran":
		case "eylul":
		case "kasim":
			System.out.println(ay + " ayi 30 gun icerir");
			break;
		case "subat":
			System.out.println(ay + " ayi bu yil 28 gun icerir");
			break;
		default:
			System.out.println("Lutfen gecerli bir ay giriniz");
			break;

		}

		scan.close();
	}

}
