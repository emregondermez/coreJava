package day38_Overriding;

class Derived{
	public void getDetails() {
		System.out.println("Derived class ");
	}
}


public class S03 extends Derived{
	
	public void getDetails() {
		System.out.println("Test class ");
		super.getDetails();
	}

	public static void main(String[] args) {
		
		S03 obj = new S03();
		obj.getDetails();
	}

}
