package day38_Overriding;

public class Kuslar extends Animal{

	public static void main(String[] args) {

	}
	@Override
	public void hareket() {
		System.out.println("Kuslar ucarak hareket eder");
	}
	@Override
	public void solunum() {
		System.out.println("Kuslar akciger solunumu yapar");
	}
}
