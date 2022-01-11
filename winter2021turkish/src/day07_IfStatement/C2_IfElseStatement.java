package day07_IfStatement;

import java.util.Scanner;

public class C2_IfElseStatement {

	public static void main(String[] args) {
		// dikdortgen uzunluklarini alin
		//uzunluklar esitse kare degilse kare degil yazdrin

		System.out.println("Lutfen dortgenin kare uzunluklarini giriniz");
		Scanner scan = new Scanner(System.in);
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("kare");
			} else {
				System.out.println("kare degil");
				
			}
	
		scan.close();
	}

}
