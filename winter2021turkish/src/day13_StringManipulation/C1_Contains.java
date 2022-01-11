package day13_StringManipulation;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve aramak istedigi bir String isteyin

		System.out.println("lutfen bir cumle giriniz");
		Scanner scan = new Scanner(System.in);
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("aramak istediginiz kelimeyi giriniz");
		String aranan = scan.nextLine().toLowerCase();

		Boolean sonuc = cumle.contains(aranan);

		if (sonuc == true) {
			System.out.println("basarili");
		} else {
			System.out.println("basarisiz");
		}

		System.out.println(sonuc == true ? "basarili" : "basarisiz");

		// kullanicidan mail adresini isteyin
		//mail adresi @gmail.com iceriyorsa "mailiniz kaydedildi" yoksa "lutfen gmail adresi giriniz" yazdirin 

		System.out.println("lutfen mail adresinizi giriniz");

		String mail = scan.nextLine().toLowerCase();
		
		

		boolean sonuc2 = mail.contains("@gmail.com");

		if (sonuc2 == true) {
			System.out.println("mail kaydedildi");
		} else {
			System.out.println("lutfen gmail adresi giriniz");
		}

		scan.close();
	}

}
