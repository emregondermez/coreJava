package day07_IfStatement;

import java.util.Scanner;

public class C02_IfStatement {

	public static void main(String[] args) {
		
		 /*
         * Soru 3) Kullanicidan gun ismini alin ve 
         * haftaici veya hafta sonu oldugunu yazdirin 
            Ornek:      gun=Pazar output = “Hafta sonu”
                        gun=Sali output = “Hafta ici”
         *** String icin equals method’unu kullanin
         */
		
		
		
		 // String non primitive oldugu icin == ,  != gibi matematiksel ifadeler ile kullanilmaz .! .! .! 
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir gun ismi giriniz");
		String gun = scan.next();
		
		if (gun.equalsIgnoreCase("Pazartesi") || gun.equalsIgnoreCase("Sali") 
				|| gun.equalsIgnoreCase("Carsamba") ||gun.equalsIgnoreCase("persembe") 
				|| gun.equalsIgnoreCase("Cuma")) {
			System.out.println("Haftaici");
		}
		if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("Pazar")) {
			System.out.println("Haftasonu");
		}
		
		if (!gun.equalsIgnoreCase("Pazartesi") && !gun.equalsIgnoreCase("Sali") 
				&& !gun.equalsIgnoreCase("Carsamba") && !gun.equalsIgnoreCase("persembe") 
				&& !gun.equalsIgnoreCase("Cuma") && !gun.equalsIgnoreCase("cumartesi") && !gun.equalsIgnoreCase("Pazar")) {
			System.out.println(". . . Lutfen gecerli bir gun ismi giriniz . . .");
		}
		
		
		
		scan.close();
	}

}
