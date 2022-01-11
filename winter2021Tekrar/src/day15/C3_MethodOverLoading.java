package day15;

public class C3_MethodOverLoading {

	public static void main(String[] args) {
		
		add(3,5);
		add(1.2,4);
		add(1.2,5.6);
		add('a', 'b');
	 
	
	}//main method sonu
	
	public static void add(int num1, int num2) {
		System.out.println("int and int "+(num1+num2));
	}
	public static void add(double num1, double num2) {
		System.out.println("double and double "+(num1+num2));
	}
	public static void add(double num1, int num2) {
		System.out.println("double and int "+(num1+num2));
	}
	public static void add(char num1, char num2) {
		System.out.println("char and char "+(num1+num2));
	}

}// class sonu
