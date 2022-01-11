package day25_arays;

import java.util.Arrays;

public class Arrays02 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// verilen bir array'de bir elemanin olup olmadigini nasil kontrol ederiz?

		int arr[] = { 10, 25, 3, 16, 75 };
		int sayi = 25;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==sayi) {
			flag=true;
			}
			
		}
		if (flag=true) {
			System.out.println("array sorulan elemani iceriyor");
		}else {
			System.out.println("array sorulan elemani icermiyor");
		}
		
		// Arrays class'inda method kullanarak yapalim
		//ilk once siralama yapmaliyiz.
		
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 25)); //sonuc olarak sonuc degil aranan sayinin index'ini verir
		
	}

}
