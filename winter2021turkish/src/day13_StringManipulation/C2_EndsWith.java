package day13_StringManipulation;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
	
		
		String str = "Java ile hayat ne guzel";
		
		System.out.println(str.endsWith("zel"));//true
		System.out.println(str.endsWith("ne guzel")); // true
		
		System.out.println(str.endsWith("zel "));//false --> sonda bosluk var
		
		// Kullanicidan bir email isteyin
		// eger @ isareti ivecermiyorsa "girdiginiz bilgi email degil"
		// eger @ isareti iceriyor ama @gmail.com icermiyorsa "lutfen gmail adresi yazin"
		// eger ilk iki sarti sagliyor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi" yazsin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen mail adresinizi giriniz");
		String mail = scan.nextLine().toLowerCase();
	
		boolean contain1 = mail.contains("@");
		boolean contain2 = mail.contains("@gmail.com");
		
		
		if (contain1==false) {
			System.out.println("girdiginiz bilgi email degil");
		} else if(contain2==false) {
			System.out.println("lutfen gmail adresi yazin");
		}else if(mail.endsWith("@gmail.com")) {
			System.out.println("basarili giris");
		}else {
			System.out.println("gecersiz gmail adresi");
		}
		
		scan.close();
	}

}
