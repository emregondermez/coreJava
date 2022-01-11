package day19_doWhileLoop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve hhartf isteyin
		// while loop kullanarak cumlede istenen harf kac kez kullanilmis bulunuz
		// program case Sensitive olsun

		Scanner scan = new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String cumle = scan.nextLine();
		System.out.println("saymak istediginiz harfi giriniz");
		String harf = scan.next().substring(0, 1);
		
		int count=0;
		int index=0;
		while(index<cumle.length()) {
			if (cumle.subSequence(index, index+1).equals(harf)) {
				count++;
			}
		index++;
		}
		System.out.println("cumlede "+harf+" harfi "+count+" defa kullanilmis.");
		
		
		
		scan.close();
	}

}
