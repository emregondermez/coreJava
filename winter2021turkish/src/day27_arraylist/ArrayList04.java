package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {

		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		
		// equals() metodu 2 listeyi hem elemanlar hem de elemanlarin index'lerini karsilasitirir.
		// hem elemanlar hem index'ler esir ise true doner yoksa false doner
		System.out.println(list1.equals(list2)); // false
		
		
		list1.clear();
		// liste'nin tum elemalarini siler
		System.out.println(list1);// []
		
		

	}

}
