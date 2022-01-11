package day03scanner;

import java.util.Scanner;

public class Scanner03 {
		public static void main(String[] args) {
			
			//please type the code to get the width and lenght of a rectangle from user
			//then calculate the perimeter and area of the rectangle
			
			Scanner scan = new Scanner(System.in);
			System.out.println("please enter the width of the rectangle");
			double width = scan.nextDouble();
			
			System.out.println("please enter the lenght of the rectangle");
			double lenght = scan.nextDouble();
			
			System.out.println("perimeter : " + (2*width+2*lenght));
			System.out.println("area : " + (width*lenght ));
			
			//2.way 
			double perimeter = 2*width+2*lenght;
			System.out.println("perimter : " + perimeter );
			double area = width*lenght;
			System.out.println("area : " + area);
			
			
			
			scan.close();
			
			
			
			
			
		}
}
