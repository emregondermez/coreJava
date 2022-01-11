package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {
	
	public static void main(String[] args) {
		// Vrilen bir listede, icinde belirli bir harf olan elemanlari
		// silen method yaziniz

		List<String> list= new ArrayList<>();
		list.add("Mustafa");
		list.add("Ceyhun");
		list.add("Yildiz");
		list.add("Tugba");
		
		list.add("Turgut");
		
		String harf="a";
		
		removeHarf(list,harf);
			
		System.out.println(removeHarf(list, harf));
	}

	private static List<String> removeHarf(List<String> list, String harf) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains(harf)) {
				list.remove(list.get(i));
				i--;
				
			}
		}
		return list;

		
	}
}
