package day31_DayAndTime;

import java.time.LocalTime;

public class C02_LocalTime {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		
		System.out.println(time);
		
		int a =12;
		for (int i = 0; i < 100; i++) {
		 a +=9;
		}
		System.out.println(a);
		LocalTime time1 = LocalTime.now();
		
		System.out.println(time1);

		System.out.println(time.getNano());
	}

}
