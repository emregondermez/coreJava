package day03scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter width of the rectangle");
		double width = scan.nextDouble();
		
		System.out.println("Please enter the lenght of the rectangle");
		double lenght= scan.nextDouble();
		
		System.out.println("perimeter=" + (2*width+2*lenght)); // Perimeter
		System.out.println("field="+ width*lenght); // Field
		
		scan.close();
		
		
		
	}

}
