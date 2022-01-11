package day03scanner;

import java.util.Scanner;

public class Scanner01 {

		public static void main(String[] args) {
			
			/*
			 * in every aplication, we need to communicatewith the user.
			 * to communite with the user we use Scanner class.
			 */
			 
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age = scan.nextInt();
		System.out.println("your age" + ' ' +age);
		
		scan.close();
		
		 
		
		
		
		}
		
		
}
