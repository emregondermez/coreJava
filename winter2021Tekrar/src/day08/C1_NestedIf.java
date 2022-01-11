package day08;

import java.util.Scanner;

public class C1_NestedIf {

	public static void main(String[] args) {
		
		// Nested: ic ice
		// verilen yas icin kisinin emekli olup olmayacagini yazdiran bir program yazin
		//kadinsa 60 yasindan buyuk oldugunda emeklli olabilir
		//erkekse 65 yasinda buyuk oldugunda emekli olabilir
		
		
		System.out.println("Lutfen cinsiyetinizi giriniz");
		Scanner scan = new Scanner(System.in);
		String cinsiyet = scan.nextLine();
		
		System.out.println("lutfen yazinizi giriniz");
		int yas = scan.nextInt(); 
	
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			
			if (yas<=0) {
				System.out.println("lutfen gecerli bir yas giriniz");
			} else if(yas>65){
				System.out.println("emekli olabilirsin");
			}else {
				System.out.println("emekli olamazsin");
			}
			
		
		
		} else if(cinsiyet.equalsIgnoreCase("kadin")) {
			
			if (yas<=0) {
				System.out.println("lutfen gecerli bir yas giriniz");
			} else if(yas>60){
				System.out.println("emekli olabilirsin");
			}else {
				System.out.println("emekli olamazsin");
			}
			
		
		
		}else {
			System.out.println("yazdiginiz cinsiyet sistemde tanimli degil");
		}
	
	
		
		
		
		
		scan.close();
	}

}
