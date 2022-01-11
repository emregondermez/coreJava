package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		System.out.println(list);
	
	System.out.println(list.size());
	
	System.out.println(list.remove(1)); // index'i 1 olan Can'i silip sildigi elemani dondurecek.
	System.out.println(list); // [Ali, Ayse]
	
	
	System.out.println(list.remove("Ayse")); // Ayse'yi silecek ve bize true dondurecek.
	System.out.println(list);
	
	System.out.println(list.remove("Mehmet")); // Mehmet'i bulamadigi icin false dondurur
	
	}

}
