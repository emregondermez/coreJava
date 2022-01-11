package day18_NestedForLoop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// kullanicidan 2 tam sayi isteyin
		// ilk sayidan baslayarak , ikinci sayiya kadar ucer, ucer yazdirin
		// (ikinci sayi dahil olmak zorunda degil)

		Scanner scan = new Scanner (System.in);
		System.out.println("aralarindaki sayilari 3'er 3'er yazdirmak icin iki sayi girin");
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
	
		if (sayi1>sayi2) {
			for (int i = sayi1; i >= sayi2; i-=3) {
			System.out.print(i+" ");
			}
		} else if(sayi1<sayi2){
			for (int i = sayi1; i <= sayi2; i+=3) {
				System.out.print(i+" ");
				}
		}else {
			System.out.println("sayilar esit");
		}
		
		
//		
//		if (sayi1>sayi2) {
//			for (int i = sayi1; i >=sayi2; i-=3) {
//				System.out.print(i+" ");
//			}
//		} else if(sayi1<sayi2){
//			for (int i = sayi1; i <=sayi2; i+=3) {
//				System.out.print(i+" ");
//			}
//		}else {
//			System.out.println("sayilar esit");
//		}
	
	
	scan.close();
	}

}
