package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		//Kullanicidan gun ismini yazmasini isteyin. Girilen isim gecerli 
		//bir gun ise gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi 
		//kucuk olarak yazdirin, gun  ismi  gecerli degilse 
		//“Gecerli gun ismi giriniz” yazdirin
	
		System.out.println("bir gun ismi giriniz");
		Scanner scan = new Scanner(System.in);
		String gun = scan.nextLine();
		
		if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("pazar") ) {
			System.out.println("Paz");
		} else if(gun.equalsIgnoreCase("Sali")){
			System.out.println("Sal");
			}else if (gun.equalsIgnoreCase("carsamba")){
			System.out.println("Car");
		}else if(gun.equalsIgnoreCase("persembe")) {
			System.out.println("Per");
		}else if(gun.equalsIgnoreCase("cuma")|| gun.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
		}else
			System.out.println("lutfen gecerli bir gun giriniz");
		
		//equalsIgnoreCase(); metodu iki String in buyuk- kucuk harf hassasiyeti olmadan 
		//esit olup olmadigini kontrol eder
	
	
	scan.close();
	}


}
