package day10;

import java.util.Scanner;

public class C2_IfStatement {

	public static void main(String[] args) {
		// get a integer from user
		// if the integer is a odd the output will be "the integer is odd"
		// if the integer is a even the output will be "the integer is even"

		System.out.println("please enter a integer");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		if(number%2==0) {
			System.out.println("the integer is even");
		}else {
			System.out.println("the integer is odd");
		}
	
	scan.close();
	}

}
