package day21;

public class Scope4 {

	public static void main(String[] args) {
		
		int sayi=10;
System.out.println(sayi);
	
	System.out.println();
	
	}

	public static void staticMethod() {
		String isim="Hasan";
		System.out.println(isim);
	}
	public void method() {
		boolean isTrue=true;
		System.out.println(isTrue);
	}
}
