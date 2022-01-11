package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// ullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin

	
		System.out.println("lutfen bir sayi giribiz");
		Scanner scan = new Scanner(System.in);
		int sayi1 = scan.nextInt();
		
		System.out.println(sayi1%2==0 ? "cift sayi" : "tek sayi");
		
	
		
		// girilen sayinin mutlak degerini bulunuz
	
		System.out.println("mutlak degeri= "+(sayi1>0 ? sayi1 : -sayi1));
		
		
		
		scan.close();
	}

}
