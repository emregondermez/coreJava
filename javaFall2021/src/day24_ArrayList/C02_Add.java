package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		
		List <String> isimler = new ArrayList<>();
	
		System.out.println("Bos Liste : "+isimler);
		isimler.add("Ali");
		System.out.println("Bir eleman : "+isimler);
		isimler.add("Veli");
		System.out.println("iki eleman : "+isimler); // add metodu listenin sonua ekleme yapar
		
		
		List<String> liste2= new ArrayList<>();
		liste2.add("taci");
		liste2.add("emre");
		liste2.add("ismail");
		
//		liste2.addAll(isimler);
//		System.out.println(liste2);
		liste2.addAll(2, isimler);
	System.out.println(liste2);
	}

}
