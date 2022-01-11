package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kullanicidan ismini ve soy ismini alip aralarinda bir bosluk birakarak isim ve soyismi yazdirin
		//Mehmet, Bulutluoz => Mehmet Bulutluoz
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen isminizi giriniz");
		String name=scan.nextLine(); // sadece next secilirse kullanici birdan fazla girse bile sadece ilk kelimeyi alir
								// eger kullanicinin girdigi tum yaziliyi kullanacaksak nextLine secmeliyiz
		
		System.out.println("Lutfen soyisminizi giriniz");
		String surname=scan.nextLine();
		
		System.out.println(name+ ' ' +surname);
	
		scan.close();
	}

}
