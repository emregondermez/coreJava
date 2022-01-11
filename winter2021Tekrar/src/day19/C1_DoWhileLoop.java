package day19;

import java.util.Scanner;

public class C1_DoWhileLoop {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve bir harf isteyin
		// while loop kullanarak cumlede istenen harf kac kez kullanilmis bulunuz
		// program case sensitive olsun

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		System.out.println("lutfen bir harf giriniz");
		String harf = scan.next().substring(0, 1);
		
		int index=0;
		int count=0;
		
		while(index<cumle.length()) {
			if (cumle.substring(index, index+1).equals(harf)) {
				count++;
			}
			index++;
		}System.out.println(count+" defa kullanilmistir");
			
		scan.close();
	}

}
