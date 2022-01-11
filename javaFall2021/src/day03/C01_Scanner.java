package day03;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		// kullanicidan yari cap isteyip cemberin cevresini ve alanini 
		// bulunuz
		
	
		Scanner scan= new Scanner (System.in);
		
		System.out.println("lutfen cemberin yari capini giriniz");
		
		double yaricap= scan.nextDouble();
		double cevre=2*3.14*yaricap;
		double alan=3.14*yaricap*yaricap;
		System.out.println("cemberin cevresi: "+cevre );
		System.out.println("dairenin alani "+alan);
		
	
		scan.close();
	}

}
