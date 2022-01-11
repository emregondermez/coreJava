package day12_StringManipulation2;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lutfen bir kelime yaziniz");
		Scanner scan = new Scanner(System.in);
		String kelime = scan.nextLine().toUpperCase();
		int uzunluk = kelime.length();
		System.out.println(kelime.charAt(uzunluk-1));
	
		
		//String str2 = "";
		//length() medtodu girilen String'in uzunlugunu verir
		
		//String str3 = null; // null hic demek
							// normalde e String ler "" icine yazilir ama null icin buna gerek yoktur
							//null bir deger degildir, sadece hicligi gosteren bir pointer'dir.
		
		// System.out.println(str3.length()); // hata verir
		// null deger atanan String ile String manipulation method lari kullanilamaz
		
		//System.out.println(str3.equals(str2)); // hata verir
		
		scan.close();
	}

}
