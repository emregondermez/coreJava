package day19_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {
		// Kullanicdan bir sayi alin 
		// bu sayiyi tam bolen sayilari ve kac tane olduklarini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bolen sayisini bulmak icin bir sayi girin");

		int sayi=scan.nextInt();
		int bolen =1;
		int sayac =0;
		
		System.out.println(sayi + " sayisini tam bolen sayilar; ");
		while (bolen<=sayi) {
	
			if (sayi%bolen==0) {
			System.out.print(bolen+" ");
			sayac++;
		} 
		bolen++;	
		
		}
	System.out.println(" olmak uzere "+sayac+" adettir");
			
		
		
		
		scan.close();
	}

}
