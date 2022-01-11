package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		String isim="Ali";
		
		isim.concat("Can");
		System.out.println(isim); // Ali
		
		System.out.println(isim.concat(" Can")); // Ali Can
		System.out.println(isim);// Ali
		
		// String lerde method ile yaptigimiz degisiklikler kalici olmaz
		// cunku Java String Class'i immutable yapmistir.
		
		List<String> isimList= new ArrayList<>();
		
		System.out.println(isimList); // []
		isimList.add("Ali");
		isimList.add("Can");
		System.out.println(isimList); // [Ali, Can]
		isimList.remove(1);
		System.out.println(isimList);// [Ali]
		
		// list'ler de metodla yaptigimiz degisiklikler kalici olur
		
		
	}

}
