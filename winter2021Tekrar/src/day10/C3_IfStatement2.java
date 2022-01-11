package day10;

import java.util.Scanner;

public class C3_IfStatement2 {

	public static void main(String[] args) {
		//  To guess the day, ask the user for initial of day
		// S ==> sunday, saturday
		// f==> friday
		// w==> wednesday, 
		//m ==>monday
		//t ==> thursday, tuesday
	
	
		System.out.println("To guess the day, enter the initial of day");
		Scanner scan = new Scanner(System.in);
		char initial = scan.next().toLowerCase().charAt(0);
		
		if(initial=='s' ) {
			System.out.println("saturday ,sunday");
		}else if(initial=='f') {
			System.out.println("friday");
		}else if(initial=='w') {
			System.out.println("wednesday");
		}else if(initial=='m') {
			System.out.println("monday");
		}else if(initial=='t'){
			System.out.println("thursday ,tuesday");
		}else {
			System.out.println("please enter a valid initial");
		}
	
		scan.close();
	}

}
