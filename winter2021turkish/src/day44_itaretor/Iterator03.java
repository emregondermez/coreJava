package day44_itaretor;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class Iterator03 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		/*
		 * Bir listedeki istenen sayi aralinda omayan elementleri silen bir program
		 * yaziniz (2. liste olusturmadan gecerli liste uzerinde islem yapiniz) orn:
		 * [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi(sinirlar dahil) output :
		 * [23,40]
		 * 
		 */

		List<Integer> sayiListesi = new ArrayList<>();
		sayiListesi.add(2);
		sayiListesi.add(13);
		sayiListesi.add(56);
		sayiListesi.add(23);
		sayiListesi.add(45);
		sayiListesi.add(14);
		sayiListesi.add(40);

		ListIterator il1= sayiListesi.listIterator();
		
		
		while(il1.hasNext()) {
			
			int temp =(int) il1.next();
			if (temp<20 || temp>40) {
				il1.remove();
			}
			
		}System.out.println(sayiListesi);
	
	}

}
