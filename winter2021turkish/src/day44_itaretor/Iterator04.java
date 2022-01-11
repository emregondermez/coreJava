package day44_itaretor;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		// Iteratotor kullanarak elemanlari bastan sona dogru yazdirin

		List<Integer> sayiListesi = new ArrayList<>();
		sayiListesi.add(2);
		sayiListesi.add(13);
		sayiListesi.add(56);
		sayiListesi.add(23);
		sayiListesi.add(45);
		sayiListesi.add(14);
		sayiListesi.add(40);

		   
		System.out.println(sayiListesi);

		ListIterator li1 = sayiListesi.listIterator();
		while (li1.hasNext()) {
			li1.next();
		}

		while(li1.hasPrevious()) {
			System.out.print(li1.previous()+" ");
		}
	System.out.println("");
	System.out.println(sayiListesi);
	}
	

}
