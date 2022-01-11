package day17_ForLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin 
		// ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
	
		Scanner scan = new Scanner(System.in);
		System.out.println("10 dan kucuk bir sayi girin ");
		int sayi = scan.nextInt();
	
		
		if (sayi<0 || sayi>10) {
			System.out.println("sinirlari astin");
		} else {
			int f=1;
			System.out.print(sayi+"!=");
			for (int i = sayi; i >1; i--) {
				f*=i;
				System.out.print(i+"*");
			}System.out.print(1);
			System.out.print("="+f);
		}
		
		
		
		
		
		
		
		
		
		System.out.println("\n>>>>>>2. cozum<<<<<<<");
		
		
		
		
		
		
		
		
		
		if (sayi<=10 && sayi>0) {
			int f = 1;
			System.out.print(sayi+"!= ");
			for (int i = 1; i <=sayi; i++) {
				if (i==sayi) {
					System.out.print(i);
				} else {
					System.out.print(i+"*");
				}
				f*=i;
			}
			System.out.println("="+f);

		} else {
			System.out.println("gecerli bir sayi giriniz");
		}
		
	scan.close();
	}

}
