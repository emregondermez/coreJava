package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArrayAsList {

	public static void main(String[] args) {
		// verilen array i Arrays class'indan yardim alarak 
		// liste cevrirebiliriz

		String arr[] = {"as","asd","s"};
		
		List<String> asArr = Arrays.asList(arr);
		
		System.out.println(asArr);
	}

}
