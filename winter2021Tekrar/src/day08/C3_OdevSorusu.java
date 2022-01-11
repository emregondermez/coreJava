package day08;

import java.util.Scanner;

public class C3_OdevSorusu {

	public static void main(String[] args) {
		/* Soru 12) Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. 
		Girdiği sayi 5’e bölünüyorsa  son rakamını kontrol edin. 
		Son rakamı 0 ise ekrana “5’e bölünen çift sayı”  yazdırın.
		Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
		Girdiği password  5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
		*/
	
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		Scanner scan =new Scanner(System.in);
		int sayi = scan.nextInt();
		
		if (sayi%10==0 && sayi<9999) {
			System.out.println("5'e bolunebilen cift sayi");
		
		} else if(sayi%10!=0 && sayi%5==0 && sayi<9999) {
			System.out.println("5'e bolunebilen tek sayi");
		
		}else {
			System.out.println("Tekrar deneyin");
		}
		
	
		
		// nested if ile cozum
		System.out.println(" ");
		System.out.println("NESTED IF ILE COZUM");
		
		if (sayi%5==0 && sayi%10!=0) {
			
			if (sayi>9999) {
				System.out.println("Lutfen 4 basamakli bir sayi giriniz");
			}else if(sayi<0) {
				System.out.println("lutfen pozitif bir sayi yaziniz");
			
			} else {
				System.out.println("5'e bolunebilen tek sayi");
			}		
		
		
		
		} else if(sayi%10==0) {
			
			if (sayi>9999) {
				System.out.println("Lutfen 4 basamakli bir sayi giriniz");
			}else if(sayi<0) {
				System.out.println("lutfen pozitif bir sayi yaziniz");
			
			} else {
				System.out.println("5'e bolunebilen cift sayi");
			}		
		
		
		
		}else {
			System.out.println("tekrar deneyin");
		}
	
	
	
	
	
	
	
	
	scan.close();
	}

}
