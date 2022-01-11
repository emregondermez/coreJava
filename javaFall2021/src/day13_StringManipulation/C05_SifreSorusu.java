package day13_StringManipulation;

import java.util.Scanner;

public class C05_SifreSorusu {

	public static void main(String[] args) {
		// Kullanicidan isimini ve kredi karti bilgisini isteyin
		// ve asagidaki gibi yazdirin
		// isim: M**** B****
		//kart no : **** **** **** 7963
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen isinizi giriniz");
		String isim = scan.nextLine();
		System.out.println("Lutfen soyisinizi giriniz");
		String soyisim = scan.nextLine();
		System.out.println("Lutfen kart numarasinizi giriniz giriniz");
		String kartNo = scan.nextLine();
		
		
		System.out.println("isim: "+isim.substring(0,1).toLowerCase()+isim.substring(1,(isim.length()-1)).replaceAll("\\S","*")+" "
		+soyisim.substring(0,1).toLowerCase()+soyisim.substring(1,(soyisim.length()-1)).replaceAll("\\S","*"));
		
		System.out.println("kart no : "+kartNo.substring(0,kartNo.length()-4).replaceAll("\\S", "*")
				+kartNo.substring(kartNo.length()-4,kartNo.length()));
		
		
		
		
		scan.close();
	}

}
