package day24;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		/*
		 1->ic ice Array olusturdugumuzda disardaki Array'a outer Array
		 	icerdekine inner Array denir
		 2->Eger icindeki Array'lerin boyutlari birbirinden farkli ise
		 	Array'i ancak tum elemanlari yazarak declare edebiliriz
		 3->Multi dimensional Array'de bir elemanin index'i icin en disardaki Array haric elemana kadar 
		 	olan tum Array'lerin index lerini yazmak gerekir.
		 */

		int arr[][]= {{1,3,5}, {3,5},{5,9,11,3}}; // iki katli Array dir.
	
		// 11'i index ile ifade etmek istersek
		
		//arr[2][2]=11;
		System.out.println(arr[2][2]);
		
		// Eger Array'i uzunlukla declare etmek istersek inner Array uzunluklari esit olmali
		
		int arr2[][]= new int[3][2];
		// [3] Outer Array'in icinde kac tane inner Array oldugunu belirtir.
		// [2] her bir innerArray'in uzunlugu
		
		System.out.println(Arrays.toString(arr2));
		// Multi Dimensional Array lerei yazdirmak icin toString metodu kullanilamaz
		//Cunku toString metodu outer Array'i String'e cevirir.
		
		// inner Array'leri yazdirmak icin deepToString methodunu kullaniriz
		
		System.out.println(Arrays.deepToString(arr2));
	
	
	
	}

}
