package day07IfElseIf;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		 //Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
		//Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 
		//60 – 80.000 arasinda ise  “Konusabiliriz”, 
		//60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
	
	
	
		System.out.println("Lutfen maas teklifiniizi yaziniz");
		Scanner scan = new Scanner(System.in);
		double teklif = scan.nextDouble();
		
		if (teklif>=80000) {
			System.out.println("kabul ediyorum");
		} else if(teklif>60000 && teklif<80000) {
			System.out.println("konusabiliriz");
		}else {
			System.out.println("maalesef kabul edemem");
		}
	
	
	
	
	scan.close();
	}

}
