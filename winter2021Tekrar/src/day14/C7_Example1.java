package day14;

import java.util.Scanner;

public class C7_Example1 {

	public static void main(String[] args) {
		// kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
		
		System.out.println("Lutfen testen yazdirmak istediginiz 4 harfli bir kelime yaziniz");
		Scanner scan= new Scanner(System.in);
		String kelime =scan.nextLine();
		
		if (kelime.length()!=4) {
			System.out.println("lutfen 4 harfli bir kelime yaziniz");
		} else if(kelime.length()==4){
			System.out.println(kelime.charAt(3)+""+kelime.charAt(2)+""+kelime.charAt(1)+""+kelime.charAt(0));
		}else {
			System.out.println("lutfen gecerli bir deger giriniz");
		}
	
	scan.close();
	System.out.println("////////////SORU 2///////////");
	//////////////////////////SORU 2/////////////////////////////
	
		/*
		 string seklinde verilen fiyatlarin toplamini bulunuz 
		*/
		String str1 = "$13.99", str2="$10.55";
		
		String str01 = str1.substring(1);
		String str02 = str2.substring(1);
		
		double sayi1=Double.parseDouble(str01);
		double sayi2= Double.parseDouble(str02);
		
		System.out.println("$"+(sayi1+sayi2));
		
		
		
		
	
		
	}

}
