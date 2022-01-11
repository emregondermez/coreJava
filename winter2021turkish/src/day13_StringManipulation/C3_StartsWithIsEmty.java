package day13_StringManipulation;

public class C3_StartsWithIsEmty {

	public static void main(String[] args) {

		String str = "Her gun Java olsa";

		System.out.println(str.startsWith("H"));
		System.out.println(str.startsWith("Her"));
		System.out.println(str.startsWith("g", 4));
		
		
		//
		
		System.out.println(str.isEmpty());
		
		String str2 ="";
		System.out.println(str2.isEmpty());
	}

}
