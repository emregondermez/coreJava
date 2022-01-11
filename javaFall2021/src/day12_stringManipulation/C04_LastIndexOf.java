package day12_stringManipulation;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir kelime ve bir harf isteyin
		// asagidakilerden uygun olani yazdirin :
		// girilen kelime cumlede kullanilmamis
		// 1 kere kullanilmis
		// 1'den fazla kullanilmis
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir cumle girin");
		String str1 = scan.nextLine();
		System.out.println("Lutfen aramak icin bir harf girin");
		char chr = scan.next().charAt(0);

		if (str1.lastIndexOf(chr)<0) {
			System.out.println("girilen kelime cumlede kullanilmamis");
		} else if(str1.indexOf(chr)!=str1.lastIndexOf(chr)){
			System.out.println("1'den fazla");
		}else {
			System.out.println("1 kere kullanilmis");
		}
		
		
		
		
		
		
		scan.close();
	}

}
