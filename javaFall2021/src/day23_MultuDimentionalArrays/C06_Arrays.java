package day23_MultuDimentionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// verilen iki array'i birlestiren ve sonucu birlesik array isminde
		// bir array a kaydeden bir method olusturunuz

		int arr1[] = { 1, 3, 5 };
		int arr2[] = { 13, 77, 5, 10 };

		int birlesikArr[] = birlestir(arr1, arr2);
		System.out.println(Arrays.toString(birlesikArr));

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		int birlesikArray[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			birlesikArray[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			birlesikArray[arr1.length + i] = arr2[i];
		}

		return birlesikArray;
	}

}
