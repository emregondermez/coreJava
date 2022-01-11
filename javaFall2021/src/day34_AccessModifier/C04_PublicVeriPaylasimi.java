package day34_AccessModifier;

public class C04_PublicVeriPaylasimi {

	public static void main(String[] args) {
		
		C03 obj = new C03();
		
		System.out.println(obj.isim);
		System.out.println(obj.maas);
		
		obj.isim="Veli kaan";
		obj.maas=10000;
		
		System.out.println(obj.isim);
		System.out.println(obj.maas);
	}

}
