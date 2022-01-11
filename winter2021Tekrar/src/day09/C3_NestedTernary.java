package day09;

import java.util.Scanner;

public class C3_NestedTernary {

	public static void main(String[] args) {
		// kullanicidan bir har isteyin buyuk harf ise buyuk harf
		//kucuk harf ise kucuk harf yazdirin
		// harf degilse gecerli karakter girin
		
		
		System.out.println("lutfen bir harf girin");
		Scanner scan = new Scanner(System.in);
		char ilkHarf = scan.next().charAt(0);
		
		System.out.println(ilkHarf>='A' && ilkHarf<='z' ? ilkHarf>= 'a' && ilkHarf<='z' ? "kucuk harf" : "buyuk harf" 
							: "gecerli bir karakter giriniz" );
		
		
		scan.close();
	}

}
