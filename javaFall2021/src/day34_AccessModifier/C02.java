package day34_AccessModifier;

public class C02 {

	public static void main(String[] args) {
		C01 obj = new C01();
		System.out.println(obj.sayiDefault);
	//	System.out.println(obj.sayiPrivate); -------> Private varible'lara kendi class'i disindan ulasilamaz
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);

	}
	
	public void staticOlmayanMethod() {
		C01 obj = new C01();
		System.out.println(obj.sayiDefault);
	//	System.out.println(obj.sayiPrivate); -------> Private varible'lara kendi class'i disindan ulasilamaz
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
	}

}
