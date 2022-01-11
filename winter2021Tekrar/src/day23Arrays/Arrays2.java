package day23Arrays;

import java.util.Arrays;

public class Arrays2 {

	public static void main(String[] args) {
		// karisik sirali gelen bir array'i sirali olarak yazidiriniz

		int arr[]= {12,4,5,67,8344,123,3};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// ayni arary'i buyuktan kucuge dogru nasil siralayabilriz?
		
		
		int arrTers[]= new  int [arr.length]; // ilk arraay'in uzunluguna esit bir array olusuturduk. 
		for (int i = 0; i < arrTers.length; i++) {
			arrTers[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(arrTers));
	}

}
