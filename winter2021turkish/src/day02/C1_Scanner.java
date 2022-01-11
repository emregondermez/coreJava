package day02;

import java.util.Scanner;

public class C1_Scanner {
        public static void main(String[] args) {
		
			
        	Scanner scan = new Scanner(System.in);
        	
        	System.out.println("isminizi yaziniz");
        	String isim= scan.next();
        	
        	
        	System.out.println("Soyisminizi yaziniz");
        	String soyisim= scan.next();
        	
        	System.out.println("Kullanici Adiniz"+' '+isim+' '+soyisim);
        	
        	scan.close();
			
		}
}
