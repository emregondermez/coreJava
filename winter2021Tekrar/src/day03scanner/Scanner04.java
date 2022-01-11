package day03scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		// Type program which calculates the area of a square
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter side lenght of the square");
		double lenght = scan.nextDouble();
		double area = lenght*lenght;
		double perimeter = 4*lenght;
		
		System.out.println("area = " + area);
		System.out.println("perimeter = " + perimeter);
		
		scan.close();
	
		
	}

}
