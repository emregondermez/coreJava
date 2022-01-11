package day15_MedhodCreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		/*Kullaniciya kac sayi toplamak istedigini sorun. 
		 * Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin 
		 * ve sayilarin toplamini yazdirin. Kullanici toplamak istedigi sayi adedini 4’den 
		 * buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin
		 * 2 den kucuk sayi girerse "en az 2 sayi girmelisiniz"
		 */

	Scanner scan =new Scanner(System.in);
	System.out.println("lutfen kac sayi toplamak istediginizi griiniz");
	int adet = scan.nextInt();
	
	
	
	
	if (adet<2) {
		System.out.println("en az 2 sayi girmelisiniz");
	} else if(adet==2){
		ikiSayiTopla();
	}else if(adet==3) {
		ucSayiTopla();	
	}else if(adet==4) {
		dortSayiTopla();
	}else {
		System.out.println("Cok sayi girdiniz, ben toplayamam");
	}
	
	
	
	
	
	scan.close();
	}
	
	
	private static void dortSayiTopla() {
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen dort sayi giriniz");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		double sayi3= scan.nextDouble();
		double sayi4= scan.nextDouble();
		System.out.println("dort sayinin toplami: "+(sayi1+sayi2+sayi3+sayi4));
		scan.close();
	}

	public static void ucSayiTopla() {
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen 3 sayi giriniz");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		double sayi3= scan.nextDouble();
		System.out.println("uc sayinin toplami: "+(sayi1+sayi2+sayi3));
		scan.close();
		
	}

	public static void ikiSayiTopla() {
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen 3 sayi giriniz");
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		System.out.println("2 sayinin toplami: "+(sayi1+sayi2));
		scan.close();
	}

}
