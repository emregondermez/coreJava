package day18;


import java.util.Scanner;

public class C2_NestedForLoop {

	public static void main(String[] args) {
//		Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
//		carpim tablosu olusturun. Ornek,kullanici 3 girerse,
//		1 2 3
//		2 4 6
//		3 6 9
	
		Scanner scan = new Scanner (System.in);
		System.out.println("carpim taplosu olusturmak icin bir rakam giriniz");
		int rakam= scan.nextInt();
		
		for (int i = 1; i <=rakam ; i++) {
			System.out.println(" ");
			for (int j = 1; j <= rakam; j++) {
				System.out.print(j*i+" ");	
				}
			 
		}
	scan.close();
	}

}
