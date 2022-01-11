package day09;

import java.util.Scanner;

public class C2_Ternary1 {

	public static void main(String[] args) {
		
		System.out.println("iki uzunluk giriniz");
		Scanner scan =new Scanner(System.in);
		double kenar1 = scan.nextDouble();
		double kenar2 = scan.nextDouble();
		
		System.out.println(kenar1>0 && kenar2>0  ? (kenar1==kenar2 ? "kare" : "dikdortgen") : ("gecerli uzunluk giriniz") );
	
	
		
		
		
		
		
		
		
		scan.close();
	}

}
