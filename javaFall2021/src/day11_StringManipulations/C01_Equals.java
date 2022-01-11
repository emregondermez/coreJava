package day11_StringManipulations;

public class C01_Equals {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a+0;
		
		System.out.println(a==b);// true
		
		
		char ch1 = 'K';
		
		char chr2 = 'K'+0;
		System.out.println(ch1==chr2); // true
		
		
		String isim = "Ali";
		String soyisim="Can";
		String ad = "Ali Can";
		String iS=isim +" "+soyisim;
		
		
		System.out.println(ad==iS); // False
		System.out.println(ad.equals(iS)); // true
		
		// String variable'larda == hem degere hem degerin referansina bakar
		// dolayisyla objeler farkli oldugunda sonuc false doner
		
		// str1.equals(str2) metodunda ise referanslara degil sadece degere bakar
		// eger derler ayni ise sonuc true doner 
		
	}

}
