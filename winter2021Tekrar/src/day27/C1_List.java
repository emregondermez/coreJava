package day27;

import java.util.ArrayList;
import java.util.List;

public class C1_List {

	public static void main(String[] args) {
		// create a method to increase every element of the given list by 3

		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(80);
		increase3(list);

	}

	public static void increase3(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) + 3);
		}
		System.out.println(list);

	}

}
