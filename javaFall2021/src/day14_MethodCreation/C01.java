package day14_MethodCreation;

public class C01 {

	public static void main(String[] args) {
		// verilen iki sayinin toplaminni ve carpmini yazdiran iki method
		// olusturun
		
		int a= 19;
		int b= 10;
		
		
	// method olusturmak icin 3 adim takip edelim
		
		//1. adim method call yazalim 
		
		toplama(a,b);
		
		// 2.adim Method a arguman yazacak miyiz karar verelim
		
		
		//3.adim 1 ve 2. adimlardan sonra method olusturlur

		
		carpma(a,b);
		
		
	}

	public static void carpma(int a, int b) {
		System.out.println("sayilarin carpimi : "+(a*b));
		
	}

	public static void toplama(int a, int b) {
		//4. adim access modifier ve return type karar vermeliyiz
		// access modifer'i public yaptik
		// bizden sadece yazdirma istendigi icin void kalabilir
		
		System.out.println("sayilarin toplami : "+(a+b));
	}

}
