package day17_ForLoop;

import java.util.Scanner;

class C05_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki
		// tamsayilari toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayi girin ");
		System.out.print("sayi 1 : ");
		int sayi1 = scan.nextInt();
		System.out.print("sayi 2 : ");
		int sayi2 = scan.nextInt();

		
		if (sayi1 < sayi2) {
			int top = 0;
			
			for (int i = sayi1; i <= sayi2; i++) {

				top += i;
			}
			System.out.println(top);
		
		} else if (sayi1 > sayi2) {
			
			int top2 = 0;
			for (int i = sayi2; i <= sayi1; i++) {
				top2 += i;
			}
			System.out.println(top2);
		
		} else {
			System.out.println("girdiginiz sayilar esit");
		}

		
		
		
		scan.close();
	}

}
