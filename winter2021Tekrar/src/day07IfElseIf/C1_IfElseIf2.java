package day07IfElseIf;

import java.util.Scanner;

public class C1_IfElseIf2 {

	public static void main(String[] args) {
		
		
			// Kullanicidan artik yil olup olmadigini kontrol
			//etmek icin yil girmesini isteyin.
			//Kural 1: 4 ile bolunemeyen yillar artik yil degildir
			//Kural 2: 4’un kati olmasina ragmen 100 ile
			//bolunebilen yillardan sadece 400’un
			//kati olan yillar artik yildir
			
			System.out.println("artik yil olup olmadigini ogenmek icin bir yil giriniz");
			Scanner scan = new Scanner(System.in);
			int yil = scan.nextInt();
			
			
			if(yil%4==0 && (yil%100!=0 || yil%400==0)) {
				System.out.println("artik yildir");
			}else {
				System.out.println("artik yil degildir");
			}
		
			
			
		
			scan.close();
		}
		
	}


