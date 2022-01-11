package day11;

import java.util.Scanner;

public class C1_IfElseStetament {

	public static void main(String[] args) {
		/*
		 Ask to user to enter a character, then check whether the character is alphabet or not
		  */
			System.out.println("Please enter a character");
			Scanner scan = new Scanner(System.in);
			char ch = scan.nextLine().charAt(0);
			
			if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ) {
				System.out.println(ch +":  is in the alphabet");
			} else {
				System.out.println(ch+ ": is not in the alphabet");
			}
		
	scan.close(); 	
	}

}
