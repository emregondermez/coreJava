package day10_SwichCase;

public class C5_StringManipulation1 {

	public static void main(String[] args) {
		// String non-primitive data turundedir
		// non-primitive datra turleri value ile birlikte methodlara sahiptir
		
		
		String str = "Hello World";
		System.out.println(str.toUpperCase()); //HELLO WORLD
		System.out.println(str); // Hello World
		
		String str2=str.toUpperCase();
		System.out.println(str);
		System.out.println(str2);
	}

}
