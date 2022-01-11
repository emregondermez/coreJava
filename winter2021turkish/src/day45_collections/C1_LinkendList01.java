package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkendList01 {

	public static void main(String[] args) {
		// Linked bagli demktir
		// Linked list'te tum elemanlar tren gibi birbirine baglidir

		/*
		 * 1-> ilk eleman her zaman head dir ve head'da date yoktur sadece adres vardir
		 * 2-> son eleman (tail) null 'i point eder 3-> her elemanin icinde date ve
		 * address kismi olmak uzere iki kisimm vardir 4-> Tum elemanlar pointer'lar ve
		 * address'ler kullanilarak birbirne baglanir 5-> Her eleman node olarak
		 * adlandirilir 6-> Array'lerden daha dynamic'dirler . insert(ekleme) ve
		 * delete(silme) islemlerinde basarilidirlar 7-> Bir elemana ulasamada
		 * yavastirlar cunku index kullanmazlar
		 */

		/*
		 * Collections'da obje olustururken olusturmak istedigimiz collection'in class
		 * mi yoksa interface mi olduguna bakmaliyiz Eger olusturmak istedigimiz
		 * collection interface ise data turu olarak interface'i , constructor olarak
		 * ise uygun bir class secmeliyiz simdiye kadar List olustururken constructor
		 * olarak ArrayList() seciyorduk
		 */

		List<String> liste = new ArrayList<>();
		liste.add("X");
		liste.add("Y");

		LinkedList<String> ll1 = new LinkedList<>();

		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);
		ll1.add(1, "C");
		System.out.println(ll1);
		ll1.addAll(liste);
		System.out.println(ll1);

		ll1.addAll(2, liste);
		System.out.println(ll1);
		/*
		 * Linked list ve Queue interface'lerine implement ile child oldugundan her iki
		 * interface'deki tum metodlari override etmek zorundadir islev olarak ayni isi
		 * yapan addLast() queue'dan ve add() ise List'ten inherit edilmistir.
		 */

		// bir linkedList olusturalim ama sadece List ozelliklerini tasisin

		List<String> listList = new LinkedList<>();
		listList.add("sadece List ozellikleri var");

		// bir linkedList olusturalim ama sadece Queue ozelliklerini tasisin

		Queue<String> queueList = new LinkedList<>();
		queueList.add("sadece Queue ozellikleri var");
	}

}
