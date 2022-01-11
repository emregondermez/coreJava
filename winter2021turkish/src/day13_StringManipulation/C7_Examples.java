package day13_StringManipulation;

import java.util.Scanner;

public class C7_Examples {
	public static void main(String[] args) {
		//kullanci dan 4 harfli bir kelime aliniz ve girilen kelimeyi tersten yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 harfli bir kelime yaziniz");
		String kelime = scan.nextLine();
		
		if (kelime.length()!=4) {
			System.out.println("lutfen 4 karakterli bir kelime yaziniz");
		} else {
			System.out.print(kelime.charAt(3));
			System.out.print(kelime.charAt(2));
			System.out.print(kelime.charAt(1));
			System.out.print(kelime.charAt(0));
		}
	
	
	
	scan.close();
	}
}
