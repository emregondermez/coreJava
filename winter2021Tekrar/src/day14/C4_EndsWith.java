package day14;

import java.util.Scanner;

public class C4_EndsWith {

	public static void main(String[] args) {
		// kullanicidan mail adresini isteyin
		// eger @ isareti iscermiyorsa "girdiginiz bilgi mail degil"
		// eger @ iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi yazin"
		// eger ilk iki satir sagliyor ama @gmail.com ile bitmiyorsa "gecersiz mail
		// adresi"yazsin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir gmail adresi girin");
		String gmail = scan.nextLine();

		boolean isaret = gmail.contains("@");
		boolean com = gmail.contains("@gmail.com");
		boolean son = gmail.endsWith("@gmail.com");

		if (isaret == false) {
			System.out.println("girdiginiz bilgi mail degil");
		} else if (com == false) {
			System.out.println("lutfen gmail adresi yazin");
		} else if (son == false) {
			System.out.println("gecersiz mail adresi");
		} else {
			System.out.println("olmadi boyle");
		}
		
		
		
		scan.close();
	}

}
