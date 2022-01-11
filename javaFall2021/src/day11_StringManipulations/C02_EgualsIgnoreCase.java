package day11_StringManipulations;

public class C02_EgualsIgnoreCase {

	public static void main(String[] args) {


		// case sensitive'i ortadan kaldirir
		
		String isim = "ali";
		String soyisim="can";
		String ad = "Ali Can";
		String iS=isim +" "+soyisim;
		
		
		System.out.println(ad==iS); // False
		System.out.println(ad.equals(iS)); // false
		
		System.out.println(ad.equalsIgnoreCase(iS)); // true
	}

}
