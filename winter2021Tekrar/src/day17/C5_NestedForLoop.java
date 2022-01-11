package day17;

import java.util.Scanner;

public class C5_NestedForLoop {

	public static void main(String[] args) {
		/*
		  kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
		  asagidaki sekli cizdirin
		 
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
		  
		 */

		System.out.println("lutffen bir rakam giriniz");
		Scanner scan = new Scanner(System.in);
		int rakam = scan.nextInt();

	
		for (int i = 0; i <= rakam; i++) {
			System.out.println(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
		
	}
scan.close();
	}

}
