package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		System.out.println(list); // [Ali, Can, Ayse, Fatma]
		// set index deki eelemani kaldirip yerine bizim istedigimiz elamani koyar(replace)
		
		list.set(2, "Kemal");
		System.out.println(list);

		// olmayan bir index kullanilirsa rte verir
		
		
		System.out.println(list.contains("Ali")); // true 
		
		System.out.println(list.contains("Mehmet")); //False
		
		list.contains("Ali");// bize boolean bir sonuc verir, liste degismez
		
		// list'in elemanlarini siralayiniz
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
	}

}
