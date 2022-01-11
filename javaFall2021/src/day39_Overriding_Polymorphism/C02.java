package day39_Overriding_Polymorphism;

public class C02 extends C01 {

	public static void main(String[] args) {
	

	}


	public static void staticMethod() {
		System.out.println("Parent class static method calisti");
	}

	@SuppressWarnings("unused")
	private void privateMethod() {
		System.out.println("Parent class private method calisti");
	}
	public final void finalMethod() {
		System.out.println("Parent class final method calisti");
	}

}
