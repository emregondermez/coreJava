package day07_IfStatement;

import java.util.Scanner;

public class C1_IfStattement {

	public static void main(String[] args) {
		
		
		// kullanicidan bir tam sayi isteyin
		// sayi pozitifse "sayi pozitif"
		// sayi 100 den kucukse "kucuk sayi" ayzdirin
		// sayi 1000 den buyukse "buyuk sayi" yazdir
		
		System.out.println("bir tam sayi girin");
		Scanner scan = new Scanner(System.in);
		int sayi1 = scan.nextInt();
		
		if(sayi1>0) {
			System.out.println("sayi pozitif");
		}
		if(sayi1<100) {
			System.out.println("kucuk sayi");
		}

		if (sayi1>1000) {
			System.out.println("buyuk sayi");
			}
	
		scan.close();
	}

}
