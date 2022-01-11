package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_NestedIf2 {

	public static void main(String[] args) {
		/* Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
		  Kullanicidan bir sifre girmesini isteyin
		  Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. 
		  Ilk harf A ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
		  Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. 
		  Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
         */
	
	
			//1. islem kullanicidan sifreyil ilk harfine bak
			//buyuk harf mi kucuk harf mi?
		
			System.out.println("sifrenizi giriniz");
			Scanner scan = new Scanner(System.in);
			char ilkHarf= scan.next().charAt(0);
			
			if (ilkHarf>= 'A' && ilkHarf<='Z') {		//ilk harf buyukse calisacak
				
				if (ilkHarf=='A') {
					System.out.println("sifre gecerli");
				} else {
					System.out.println("sifre gecerli degil");
				}
			
			
			} else if(ilkHarf>='a' && ilkHarf<= 'z'){		//ilk harf kucukse calisacak
				if (ilkHarf=='z') {
					System.out.println("sifre gecerli");
				} else {
					System.out.println("sifre gecerli degil");
				}
			
			}else {											//ilk harf kucuk veya buyuk harf degilse calisacak	
				System.out.println("sifre gecersiz");										
			}
	
	
	
	
	
	scan.close();
	
	}

}
