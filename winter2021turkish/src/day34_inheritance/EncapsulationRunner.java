package day34_inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {
		
		Encapsulation01 obj1 = new Encapsulation01();
		System.out.println(obj1.getOkulIsmi());
		obj1.setOkulIsmi("Sarimsakli Kolej");
		System.out.println(obj1.getOkulIsmi());
		
		Encapsulation01 obj2 = new Encapsulation01();
		System.out.println(obj2.getOkulIsmi()	);
	}

}
