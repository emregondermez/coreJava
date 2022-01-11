package day06;

import java.util.Scanner;

public class C4_IfStattement {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin sayininn tek mi cift mi oldugunu yazin
		
		System.out.println("lutfen bir sayi girin");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		
		
		if (sayi%2==1 || sayi%2==-1) {
			System.out.println("girdiginiz sayi tek sayidir");
		}else {
			System.out.println("girdiginiz sayi cift sayidir");
		}
			
		
		
		
		
		
		scan.close();
	}

}
