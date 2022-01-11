package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};

		List <Integer> list= new ArrayList<>();
	
		for (int each : arr) { // arr'deki her bir in'i bana getir
		
			list.add(each);
		}
		
		System.out.println(list); 
		
		// eger bir list veya arrayín tum elamanlarini elden gecirmek istiyorsak ve siralam onemli degilse
		// for each loop kullanabiliriz
		
		
	}

}
