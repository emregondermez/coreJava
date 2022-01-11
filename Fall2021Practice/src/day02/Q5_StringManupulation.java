package day02;

import java.util.Scanner;

public class Q5_StringManupulation {

	public static void main(String[] args) {
		// print the index of first occurrence of 'a' if 'a' exist. Otherwise print no 'a'.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a string. . . ");
		String str = scan.nextLine();
		
		if (str.indexOf('a')==-1) {
			System.out.println("no 'a'");
		} else {
			System.out.println("the index of 'a' is"+str.indexOf('a'));
		}
	
		
		
		
	scan.close();
	}

}
