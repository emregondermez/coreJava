package day17;


import java.util.Scanner;


public class C4_ForLoop4 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
		 * asagidaki sekli cizdirin
		 
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
		
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("10 dan kucuk pozitif tam bir sayi giriniz ");
		int sayi = scan.nextInt();

		for (int i = 1; i <= sayi; i++) {
			System.out.println("");
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
		}

		scan.close();
	}

}
