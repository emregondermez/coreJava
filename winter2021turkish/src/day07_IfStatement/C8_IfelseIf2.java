package day07_IfStatement;

import java.util.Scanner;

public class C8_IfelseIf2 {

	public static void main(String[] args) {
		//Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
		//Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
		//60 – 80.000 arasinda ise  “Konusabiliriz”, 
		//60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
	
	
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen maas teklifinizi giriniz");
        double maas =scan.nextDouble();
	
	if (maas>80000) {
		System.out.println("KABUL EDIYORUM");
	} else if(maas>60000 && maas<80000){
		System.out.println("KONUSABILIRIZ");
	}else {
		System.out.println("maalesef kabul edemem");
	}
	
	scan.close();
	
	
	
	}
	
	

}
