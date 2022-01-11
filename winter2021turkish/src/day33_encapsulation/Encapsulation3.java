package day33_encapsulation;

public class Encapsulation3 {

	public static void main(String[] args) {
		// encapsulation02 Class'indaki Class member'lara ulasmaya calisalim
		
		Encapsulation02 obj1 = new Encapsulation02();
		
		// erisim yetkileri ikiye ayrilir
		//1 => okuyabilme get()
		//2 => deger atayabilme set()
		
		System.out.println(obj1.getOkulAdi());
		obj1.setHesapNo(9875);
		
	}

}
