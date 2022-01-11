package day09;

import java.util.Scanner;

public class C1_Ternary {

	public static void main(String[] args) {
		
		
		// kullanicidan iki sayi iste buyuk olani yazdir

		System.out.println("karsilastimak istediginiz iki sayiyi yaziniz");
	
		Scanner scan = new Scanner(System.in);
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
	
		System.out.println(sayi1>sayi2 ? sayi1 :sayi2);
	
	
		
		
		
		
		
		
		scan.close();
	}

}
