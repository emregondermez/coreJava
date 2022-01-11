package day26;

import java.util.ArrayList;
import java.util.List;

public class C3_List03 {

	public static void main(String[] args) {
		/*
		 	how to remove repeated element from a list
		 */
		
		List<Character> list = new ArrayList<Character>();
		list.add('X');
		list.add('Y');
		list.add('Z');
		list.add('X');
		list.add('Y');
		list.add('M');
		list.add('T');
		
		List<Character> list2 = new ArrayList<Character>();
		
		
		for (int i = 0; i < list.size() ; i++) {
			if (!list2.contains(list.get(i))) {
				list2.add(list.get(i));
			}
		}System.out.println(list2);
		
		
	}
}
