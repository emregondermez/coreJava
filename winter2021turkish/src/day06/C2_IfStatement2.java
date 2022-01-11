package day06;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullanicdan bir sayi isteyin ve sayinin tek mi cift mi oldugunu yadirin
		
		
		
		System.out.println("lutfen bir sayi girin");
		
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		
		if (sayi %2 == 0){
			System.out.println("girdiginiz sayi cift sayidir");
			}
	
		if (sayi %2 != 0) {
			System.out.println("girdiginiz sayi tek sayidir");
			}
		System.out.println("katildiginiz icin tesekkurler");
		
		scan.close();
	}

}
