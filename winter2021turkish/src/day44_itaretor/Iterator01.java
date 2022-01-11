package day44_itaretor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		// her elemana B harfini ekleyelim
		
		for (String each : list) {
			each+="B";
			System.out.print(each+" ");
		}
		System.out.println("");
		System.out.println(list);
	/*
	 Collections'da her yapi index'i desteklemez. Ornegin Set'de index olmaz
	 Index olmayinca mecburen tum elemanlara ulasmak icin For- each loop kullanilir
	 for-each loop ile update veya delete yapamayiz
	 Bunun icin Java Iterator Iterface'ini olusturmustur.. 
	 */
		
		Iterator it1 =  list.iterator();
	// next() -- hasNext() -- remove() method'larina sahiptir
	// listedeki elemanlari iterator kullanrak silelim.
		
	while(it1.hasNext()) {
		it1.next();
		it1.remove();
	}
	System.out.println(list);
	  
	}

}
