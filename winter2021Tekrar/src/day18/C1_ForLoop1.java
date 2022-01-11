package day18;

import java.util.Scanner;

public class C1_ForLoop1 {

	public static void main(String[] args) {
//		Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
//		asagidaki sekli cizdirin
//		*
//		* *
//		* * *
//		* * * *

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen pozitif bir rakam giriniz");
		int rakam = scan.nextInt();

		if (rakam > 0 && rakam < 10) {
			for (int i = 1; i <= rakam; i++) {
				System.out.println("");
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
			}

		} else {
			System.out.println("LUTFEN POZITIF BIR RAKAM GIRINIZ");
		}
scan.close();
	}

}
