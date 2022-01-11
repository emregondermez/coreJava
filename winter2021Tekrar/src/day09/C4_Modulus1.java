package day09;

import java.util.Scanner;

public class C4_Modulus1 {

	public static void main(String[] args) {
		// ask user to enter 3 digit integer
		//type a program to find the sum of 3 digit
		//for example= 467=> 4+6+7=17

		System.out.println("please enter a 3 digit integer");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		
		if (a<=999 && a>99) {
			int lastDigit = a%10; 
			
			int b = a/10; 
			int secondDigit =b%10;
			
			int c =b/10; 
			int thirdDigit =c%10;
			
			System.out.println(lastDigit+secondDigit+thirdDigit);
		
		} else {
			System.out.println("lutfen 3 basamakli bir sayi giriniz");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
