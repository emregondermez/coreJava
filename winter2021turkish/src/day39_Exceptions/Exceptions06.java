package day39_Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Exceptions06 {

	public static void main(String[] args) {
	
		
		int arr[]= {1,2,5,6};

		System.out.println(arr[1]);
		System.out.println(arr[3]);
	//	System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
	
		
		
		List<String> list = new ArrayList<>();
		list.add("Bahattin");
		list.add("ali");
		list.add("veli");
		
		System.out.println(list);
		System.out.println(list.get(1)); // ali
	//	System.out.println(list.get(3)); //IndexOutOfBoundsException
	
	}

}
