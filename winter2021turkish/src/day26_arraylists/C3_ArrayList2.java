package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();

	list.add(10);
	list.add(15);
	list.add(8);
	list.add(12);
	list.add(20);

	System.out.println(list);  //[10, 15, 8, 12, 20]
	System.out.println(list.size()); //5
	
	
	
	//bir eleman nasil silinir?
	list.remove(1);
	System.out.println(list); //[10, 8, 12, 20]

	System.out.println(list.remove(2));
	System.out.println(list);
	}

}
