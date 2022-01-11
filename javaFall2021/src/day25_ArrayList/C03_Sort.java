package day25_ArrayList;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
		List<String> isimler = new ArrayList<>();
		isimler.add("Ahmet");
		isimler.add("Mehmet");
		isimler.add("Cevdet");
		isimler.add("Necdet");

		System.out.println(isimler);
		Collections.sort(isimler);
		System.out.println(isimler);
	}
}
