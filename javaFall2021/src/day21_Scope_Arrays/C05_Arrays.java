package day21_Scope_Arrays;

import java.util.Arrays;

public class C05_Arrays {

	public static void main(String[] args) {
		// verilen 3 elemali bir array'in tum elamanlarini
		// bir soldaki konuma tasiyacak programi yaziniz
		// Ornek : array[1,2,3] ise output [2,3,1] olacak
		
		int arr[]= {1,2,3,34,5,45,7878,900,87};
		int kova=arr[0];
		
		
		for (int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=kova;
		
		System.out.println(Arrays.toString(arr));
	}

}
