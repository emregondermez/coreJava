package day14;

import java.util.Scanner;

public class C3_Contains {

	public static void main(String[] args) {
		// kullanicidan bir cumle isteyin cumle
		//buyuk kelimesi iceriyorsa tum cumleyi buyuk harf olarak kucuk kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin
		//iki kelimeyi de icermiyorsa cumle kucuk yad abuyuk kelimesi icermiyor yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle girin");
		String cumle =scan.nextLine();
		
		boolean b= cumle.contains("buyuk");
		boolean k= cumle.contains("kucuk");
		
		if (b==true) {
		System.out.println(cumle.toUpperCase());
		} else if(k==true){
			System.out.println(cumle.toLowerCase());
		}else {
			System.out.println("cumle kucuk yada buyuk kelimesi icermiyor");
		}
		
		
		
		
		scan.close();
	}

}
