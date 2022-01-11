package day10;

import java.util.Scanner;

public class C4_IfStatament3 {

	public static void main(String[] args) {
		// get a day name from user
		// when user enter a name of day. the output will be "weekend day" or "weekday "
		// according to name of day

		System.out.println("Please enter a day name ");
		Scanner scan = new Scanner(System.in);
		String day = scan.nextLine().toLowerCase();
		
		if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")  ) {
			System.out.println("week day");
		}else if(day.equals("saturday") || day.equals("sunday") ) {
			System.out.println("weekend day");
		}else {
			System.out.println("please enter a valid name of day");
		}
	
	scan.close();			
	}

}
