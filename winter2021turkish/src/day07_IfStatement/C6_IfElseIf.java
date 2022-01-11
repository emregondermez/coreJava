package day07_IfStatement;

import java.util.Scanner;

public class C6_IfElseIf {

	public static void main(String[] args) {
		// Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip yazdirin. 
		//50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A”

		System.out.println("lutfen nnotunuzu giriniz");
		
		Scanner scan = new Scanner(System.in);
		double not = scan.nextDouble();
		
		if (not<0 || not>100) {
			System.out.println("lutfen gecerli bir not giriniz");
		
		} else if (not<50) {
			System.out.println("notunuz: D");
		}else if(not<60) {
			System.out.println("notunuz: C");
		}else if (not<80) {
			System.out.println("notunuz: B");
		}else { 
			System.out.println("notunuz: A");
		}
			
			
		scan.close();
	}

}
