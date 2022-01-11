package day09_ternary;

import java.util.Scanner;

public class C3_Ternary3 {

	public static void main(String[] args) {
		//kullanicidan iki sayi alin ve buyuk olani yazdirin
		
		
		System.out.println("lutfen iki sayi giribiz");
		Scanner scan = new Scanner(System.in);
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
	
		System.out.println(sayi1>=sayi2  ? sayi1 : sayi2);
		
		
		
		
		
		scan.close();
	}

}
