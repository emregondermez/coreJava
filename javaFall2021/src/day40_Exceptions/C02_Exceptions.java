package day40_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exceptions {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String sec="";
		
		System.out.println("Lutfen toplamak icin bir sayi giriniz cikmak icin sayi disinda bir karakter giriniz");
		int toplam=0;
		int count=0;
		try {
			while(count<9999999) {
			System.out.println("Lutfen toplamak icin bir sayi giriniz");
			int sayi = scan.nextInt();
				toplam+=sayi;
				count++;
				
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Girdiginiz sayilarin toplami = "+toplam);
		}
		
	
		
		
		
		
	}

}
