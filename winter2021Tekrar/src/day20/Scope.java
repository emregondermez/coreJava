package day20;

public class Scope {

	 String isim="ali";
	  String soyIsim;
	
	public static void main(String[] args) {
		

		Scope obj1 = new Scope();
		System.out.println(obj1.isim);
	
		Scope obj2 = new Scope();
		obj2.isim="muslum";
		obj2.soyIsim="baba"; 
	System.out.println(obj2.isim+" "+obj2.soyIsim);
	System.out.println(obj1.isim+" "+obj1.soyIsim);
	
	
	Scope obj3 = new Scope();
	obj3.isim="Ferdi";
	obj3.soyIsim="Tayfur";
	System.out.println(obj3.isim+" "+obj3.soyIsim);
	
	 
	
	}

}
