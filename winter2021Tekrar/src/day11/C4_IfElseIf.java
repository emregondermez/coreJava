package day11;

import java.util.Scanner;

public class C4_IfElseIf {

	public static void main(String[] args) {
		/*
		 ask user to enter any name of days, then get second, fourth and sixth letters
		  of any day name and print them on the console, in the same line. For example:
		   if the user enters "Monday" output will be "ody"
		 */

		System.out.println("please enter a day name");
		Scanner scan = new Scanner(System.in);
		String day = scan.nextLine().toLowerCase();

		
		
		
		if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||day.equals("thursday") ||day.equals("friday") ||
			day.equals("saturday") ||day.equals("sunday") ){
			System.out.print(day.charAt(1));
			System.out.print(day.charAt(3));
			System.out.print(day.charAt(5));
		} else {
			System.out.println("please enter a valid day");
		 }

	
		
		scan.close();
	}

}
