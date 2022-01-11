package day02;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
	
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("dort islem yapmak icin iki sayi giriniz giriniz");
		System.out.print("sayi 1 : ");
		double sayi1=scan.nextDouble();
		System.out.print("sayi 2 : ");
		double sayi2=scan.nextDouble();
		
		System.out.println("yapmak istediginiz islemi yazin"
		+ "\n<<<<< toplama >>>>> <<<<< cikarma >>>>>\n<<<<< carpma >>>>> <<<<< bolme<<<<<");
		 
		String islem = scan.next().toLowerCase();
		
		
		
		if (islem.equals("toplama")) {
			System.out.println(sayi1+sayi2);
		
		} else if(islem.equals("cikarma")) {
			System.out.println(sayi1-sayi2);
		
		}else if(islem.equals("carpma")) {
			System.out.println(sayi1*sayi2);
		
		}else if(islem.equals("bolme")) {
			System.out.println(sayi1/sayi2);
		
		}else  {
			System.out.println("gecerli bir islem giriniz");
		}
			
		
			
		
	scan.close();
	}

}
