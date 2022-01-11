package replit;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
		 * 
		 * Input : 30  40
		 * Beklenen Cikti: 
		 * Beklenen Cikti:
		 * 30 ve 40 icin GCD = 10
		 * 30 ve 40 icin LCM = 120
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("2 tamsayi giriniz :");
		int a =scan.nextInt();
		int b =scan.nextInt();
		
		
		int kucuk=0;
		int buyuk=0;
		
		int gcd=1;
		int lcm=1;
		
		
		if (a > b) {
			buyuk = a;
			kucuk = b;
			
		} else if (b > a) {
			buyuk = b;
			kucuk = a;
			
			
		} else {
			buyuk=a;
			kucuk=a;
		}
		
		
		for (int i = 1 ; i < kucuk ; i++) {
			
			if (buyuk % i ==0 && kucuk % i == 0) {
				gcd*=i;
				kucuk=kucuk/i;
				buyuk=buyuk/i;
				
			}
			
		}
		
		
		
		lcm=kucuk*buyuk*gcd;
		
		
		System.out.println("GCD for "+a+" and "+b+" = "+gcd);
		System.out.println("LCM for "+a+" and "+b+" = "+lcm);
		
		
		scan.close();
	}

}
