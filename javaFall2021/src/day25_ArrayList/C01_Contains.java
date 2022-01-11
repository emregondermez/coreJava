package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		// verilen bir arrayda tekrar eden elemanlari silerek unique hale getirin
		
		int arr []= {1,23,4,35,5,6,6,8,9,3,9,33,435,4,1};
		System.out.println(Arrays.toString(arr));
		List<Integer> tekrarsiz = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {
				tekrarsiz.add(arr[i]);
			}
		}
		System.out.println(tekrarsiz);
		
		int arr2[]=new int[tekrarsiz.size()];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=tekrarsiz.get(i);
		}
		System.out.println(Arrays.toString(arr2));
	}

}
