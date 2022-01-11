package day14;

import java.util.Scanner;

public class C1_StringManipulation {

	public static void main(String[] args) {
		// kullanicidan bir harf ve cumle isteyin harifin cumle de olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String c = scan.nextLine();
		System.out.println("please enter a letter to looking for in the sentence ");
		char h= scan.next().charAt(0);
		
		if (c.indexOf(h)!=-1) {
			System.out.println("it contains "+ "'"+h+"'");
		} else {
			System.out.println("it does not contain "+"'"+h+"'");
		}
	
	scan.close();
	}

}
