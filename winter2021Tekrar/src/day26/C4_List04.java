package day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C4_List04 {

	public static void main(String[] args) {
		// From a integer list find the closest two elements

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(43);
		list.add(31);
		list.add(12);
		list.add(78);
		list.add(16);
		list.add(67);

		List<Integer> diffirences = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {

				diffirences.add(Math.abs(list.get(i) - list.get(j)));

			}

		}
		System.out.println(diffirences);
		Collections.sort(diffirences);
		System.out.println(diffirences);
	}

}
