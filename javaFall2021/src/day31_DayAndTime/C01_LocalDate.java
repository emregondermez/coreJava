package day31_DayAndTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {

			LocalDate date = LocalDate.now();
			System.out.println(date);

			System.out.println(date.getDayOfMonth());
			System.out.println(date.getYear());
			System.out.println(date.isAfter(date));
			System.out.println(date.plusDays(89));
			System.out.println(date.plusMonths(5));
	
			System.out.println(date.isLeapYear());
	
	
	
	
	}

}
