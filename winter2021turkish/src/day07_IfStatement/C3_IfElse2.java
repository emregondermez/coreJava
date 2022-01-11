package day07_IfStatement;

import java.util.Scanner;

public class C3_IfElse2 {

	public static void main(String[] args) {
		// kullanicidan bir karekter girmesini isteyin 
		//harf olup olmadigini yazdirin

		
		System.out.println("lutfen bir karekter giriniz");
		
		Scanner scan = new Scanner(System.in);
		char karekter =scan.next().toLowerCase().charAt(0);
		
		if (karekter>='a'&& karekter<='z' ) {
			System.out.println("bu bir harf");
			}else {
				System.out.println("bu bir harf degil");
			}
		
		
		scan.close();
	}

}
