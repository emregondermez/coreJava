package day07_IfStatement;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// yasi sor
		// 65+ ise emekli olabilirsin degilse olamazsin yazdir
		
		System.out.println("yasinizi girin");
		
		Scanner scan = new Scanner(System.in);
		double yas = scan.nextDouble();
		
		if (yas>=65) {
			System.out.println("emekli olabilir");
			
		}else {
			System.out.println("emekli olamazsin");
		}
		
		
		scan.close();
	}

}
