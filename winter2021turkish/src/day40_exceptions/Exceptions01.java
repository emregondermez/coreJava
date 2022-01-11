package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Kullanicidan yasini girmesini isteyin.
		//Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		try {
		if (yas>=0) {
			System.out.println("girdiginiz yas = "+yas);
		} else {
			throw new IllegalArgumentException();
		}
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		System.out.println("kod bloke olmamis");
		
		
	}

}
