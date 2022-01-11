package day22_ClassroomOdev;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan email girmesini isteyin
		 * @ isareti icermiyorsa “gecerli bir email girin” yazdirin
		 * @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
		 * @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail
		 * hesabinizi girin” yazdirin ORNEK: INPUT : techproed.com OUTPUT : “gecerli bir
		 * email girin” INPUT : techproed@gmail.com OUTPUT : “email onaylandi” INPUT :
		 * techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen gmail hesabinizi giriniz");
		String mail = "";
		mail = scan.next();

		if (mail.contains("@") == false) {
			System.out.println("gecerli bir mail adresi giriniz");
		} else if (mail.endsWith("@gmail.com") == true && mailCheck(mail) == true) {
			System.out.println("e-mail onaylandi ");
		} else {
			System.out.println("gecerli  bir gmail hesabi giriniz");

			scan.close();
		}
	}

	public static boolean mailCheck(String mail) {
		boolean sonuc = true;
		int count = 0;
		int index = 0;
		while (index < mail.length()) {
			if (mail.charAt(index) == '@') {
				count++;
			}
			index++;
		}
		if (count > 1) {
			sonuc = false;
		}
		return sonuc;
	}
}
