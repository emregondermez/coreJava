package day28_foreachloop;

import java.util.Arrays;


public class C4_ForEacchLoop4 {

	public static void main(String[] args) {
		/*
		 * verilen bir array den istenilen degere esit olan degeri kaldirip kalanlari
		 * yeni bir array olarak yazdiran bir metod yaziniz
		 */

		int arr[] = { 2, 3, 5, 3, 6, 4, 3, 6, 7 };
		int sayi = 3;
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == sayi) {
				count++;
			}
		}
		System.out.println(count);

		
		int arr2[] = new int[arr.length - count];
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != sayi) {
				arr2[temp] = arr[i];
				temp++;
			}
			
		}
		System.out.println(Arrays.toString(arr2));
		 
	}

}
