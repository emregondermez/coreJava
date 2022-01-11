package day23Arrays;

import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args) {
		// verilen bir arra de bir elamanin lup olmadigini nasil kontrol ederiz

		int arr[] = { 10, 25, 3, 16, 75 };

		int sayi = 16;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sayi) {
				flag = true;
			}
			
		}if (flag) {
			System.out.println("Array "+sayi+" sayisini icerir");
		}else {
			System.out.println("Array "+sayi+" sayisini icermez");
		}

		
		// Arrays class'indan method kullanarak yapalim
		// ilk once siralama yapmaliyiz
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, sayi));// sonuc olarak aranan sayinin index'ini doner
											  	 	 	   // eger yoksa eger olsaydi index'ini degil sirasini basinda eksi  isareti ile verir
		
		
	}

}
