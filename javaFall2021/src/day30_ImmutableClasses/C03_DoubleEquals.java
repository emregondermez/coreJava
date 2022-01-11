package day30_ImmutableClasses;

import java.util.ArrayList;

public class C03_DoubleEquals {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String str1 = "Mustafa";
		String str2 = "Mustafa";
		String str3 = new String ("Mustafa");
		String str4 = new String ("Mustafa");

	System.out.println(str1==str3); // false
	
	System.out.println(str1.equals(str3)); // true
	
	 
	String a = " ";
	a+=2;
	a+='c';
	a+=false;
	System.out.println(a);
	
	ArrayList <Integer> b = new ArrayList<>();
	b.add(4);
	b.add(5);
	b.set(1,6);
	b.remove(0);
	
	
	for (Integer v : b) {
		System.out.println(v);
		
	}
	
	
	}

}
