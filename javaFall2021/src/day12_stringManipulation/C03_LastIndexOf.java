package day12_stringManipulation;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin 
				// harfin cumle icinde olup olmadigini kontrol edin
				
				Scanner scan = new Scanner (System.in);
				System.out.println("Lutfen bir cumle girin");
				String str1 = scan.nextLine();
				System.out.println("Lutfen aramak icin bir harf girin");
				char chr = scan.next().charAt(0);
				
				
				if (str1.lastIndexOf(chr)>=0) {
					System.out.println("\'"+chr+"' harfi cumle icerinde mevcut");
				} else {
					System.out.println("\'"+chr+"' harfi cumle icerisinde mevcut degil");
				}
				
			scan.close();	
	}

}
