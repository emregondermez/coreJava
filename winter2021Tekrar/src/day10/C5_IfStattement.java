package day10;

import java.util.Scanner;

public class C5_IfStattement {

	public static void main(String[] args) {
		// ask user to enter the values of length and width of a rectangle
		// then check if it is square or not

		System.out.println("please enter the length of the rectangle");
		Scanner scan = new Scanner(System.in);
		double length = scan.nextDouble();
		System.out.println("please enter the width of the rectangle");
		double width = scan.nextDouble();
		
		
		if(length<=0 || width<=0) {
			System.out.println("the values must be more than 0");
		}else if(length!=width) {
			System.out.println("it is not a square");
		}else if(length<=0 || width<=0) {
			System.out.println("it is a square");
		}else {
			System.out.println("please enter a valid value");
		}
	
	scan.close();
	
	}

}
