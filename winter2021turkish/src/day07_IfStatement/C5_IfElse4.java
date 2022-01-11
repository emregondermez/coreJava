package day07_IfStatement;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
		// ucgen uzuklari iste
		// uc kenar esitse eskenar degilse eskenar degil yazdirin
		
		System.out.println("ucgenin kenarlarini yaziniz");
		Scanner scan = new Scanner(System.in);
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		double kenar3 = scan.nextDouble();
		
		if (kenar1==kenar2 && kenar1==kenar3) {
			System.out.println("eskenar ucgen");
			
		}else {
			System.out.println("eskenar degil");
		}
	
		
	scan.close();
	
	
	
	}
	

}
