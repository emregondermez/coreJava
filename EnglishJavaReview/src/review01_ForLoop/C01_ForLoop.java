package review01_ForLoop;

public class C01_ForLoop {

	public static void main(String[] args) {
		// Type a code to print unique characters on the console
		
		String s1= "Anna Maria";
		
		for (int i = 0; i < s1.length(); i++) {
			char c1=s1.charAt(i);
			if (s1.indexOf(c1)==s1.lastIndexOf(c1)) {
				System.out.print(c1);
			}
		}
		System.out.println();
		// Type a code to print String in reverse after removing space
		
		for (int i = s1.length()-1; i >= 0; i--) {
			char c1=s1.charAt(i);
			if (c1!=' ') {
				System.out.print(c1);
			}
		}
		// Type a code to find the sum of the integer from 12 to 231
		System.out.println();
		int sum =0;
		for (int i = 12; i <15; i++) {
			sum+=i;
		}
		System.out.println(sum);

	
		// type code to multiplication of the integers from 3 to 5
		
		int multiplication = 1;
		for (int i = 3; i <= 5 ; i++) {
			multiplication*=i;
		}
	System.out.println(multiplication);
	}

}
