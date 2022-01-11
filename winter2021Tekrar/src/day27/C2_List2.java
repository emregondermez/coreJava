package day27;

import java.util.ArrayList;
import java.util.List;

public class C2_List2 {

	public static void main(String[] args) {
		/*
		 Create a method to delete odd elements and increase the even elements by multiplying by 5
		 */

		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(80);
		list.add(76);
		list.add(7);
		list.add(98);
		list.add(97);
		list.add(12);
		
		noOddMoreEven(list);
	

		
	}

	public static void noOddMoreEven(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i)%2==0) {
				list.set(i, list.get(i)*5);
			} 
			if (list.get(i)%2!=0) {
				list.remove(i);
				i--;   //when I remove a odd number element the other element's index changed that's why i have to 1 decrease  "i"
			}
		}System.out.println(list);
		
	}

}
