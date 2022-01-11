package day21_Scope_Arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		//verilen bir array'in tum elemanlarini toplayiniz
		
		int arr[] ={2,3,5,1,7,6,34,4};
	
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Kucukten buyuge sirali : "+Arrays.toString(arr));

		// buyukten kucuge siralamak icin for loop kullaniriz
		
		for (int i = arr.length-1 ; i >=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		// array'in icerisne koyma icin once bos ve icine koymak istedigimiz array uzunlugunda bir array 
		// olustururuz
		
		int tersArr[]= new int [arr.length];
	

		
		for (int i = 0; i < tersArr.length; i++) {
			tersArr[i]=arr[arr.length-1-i];
		}
		System.out.println("\nBuyukten kucuge sirali : "+Arrays.toString(tersArr));
	}

}
