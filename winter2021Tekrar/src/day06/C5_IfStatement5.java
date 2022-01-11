package day06;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// Kullanicidan gun isminin ilk harfini  isteyin
		//harfe gore gun tahmini yap
		//p-->pazar, pazartesi, persembe
		//s--> sali
		//c-->carsamba, cuma, cumartesi
		
		
		System.out.println("lutfen bir harf giriniz");
		Scanner scan = new Scanner(System.in);
		char ilkHarf = scan.next().toLowerCase().charAt(0);
		
		if(ilkHarf=='s') {
			System.out.println("sali");
		}else if(ilkHarf=='p') {
			System.out.println("pazar , pazartesi, persembe");
		}else if(ilkHarf==('c')) {
			System.out.println("cuma , carsamba, cumartesi");
		}else
		 System.out.println("gecerli bir harf giriniz");
	
	
	
	
	scan.close();
	}

}
