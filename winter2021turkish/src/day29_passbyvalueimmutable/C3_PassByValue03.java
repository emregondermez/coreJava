package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

	public static void main(String[] args) {
		/*
		 * Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup
		 * list elemanlarini artirmayi deneyelim - 1. Method’da elemanlari for each loop
		 * kullanarak artirin - 2. Method’da elemanlari set method’u kullanarak artirin
		 * - Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini
		 * kontrol edelim.
		 */

		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(11);
		list1.add(12);
		System.out.println(list1);
		arttir(list1);

		degistirSet(list1);
		System.out.println("*Set ile degistirdigimiz liste main metod'un icinde : " + list1);
	}

	public static void degistirSet(List<Integer> list1) {

		for (int i = 0; i < list1.size(); i++) {
			list1.set(i, list1.get(i) + 3);

		}
		System.out.println("Set ile degistirdigimiz liste metod'un icinde : " + list1);
		// Java Past By Value calisir ama liste deki set metodu icinde yapilan degisiklikleri de kalici hale getirir.
		
	}

	public static void arttir(List<Integer> list1) {

		for (Integer each : list1) {
			each += 3;
			System.out.print(each + " ");
		}
		System.out.println("");
		System.out.println(list1);
	}

}
