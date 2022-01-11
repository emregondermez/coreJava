package day07_IfStatement;

import java.util.Scanner;

public class C04_IfStatements {

	public static void main(String[] args) {
		// Kullanicidan dortgenin kenar uzunluklarini alin
		// kare olup olmadigini yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("kare olup olmadigini ogrenmek icin dortgenin kenar uzunluklarini giriniz . . . ");
		System.out.print("Kenar 1 : ");
		double kenar1 = scan.nextDouble();
		System.out.print("kenar 2 : ");
		double kenar2 = scan.nextDouble();
		
		
		if (kenar1==kenar2) {
			System.out.println("kare ");
			
		} 
		if (kenar1!=kenar2) {
			System.out.println("kare degil ");
			
		}

		scan.close();
	}

}
