package day02;

import java.util.Scanner;

public class C2_Scanner2 {
		// kullanicidan dairenin yaricapini isteyin ve dairenin alanini yazdirin
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		System.out.println("alanini hesaplamak icin dairenin yaricapini girin");
		double yaricap= scan.nextDouble();
		
		System.out.println("dairenin alani= " + 3.14*yaricap*yaricap);
		
		scan.close();
	}

}
