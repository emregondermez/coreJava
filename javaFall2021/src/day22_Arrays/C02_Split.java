 package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		// Java ogrenmek cok guzel 
		// cumlesinin kelimelrini ters sirada yazdirin
		
		
		String str="Java ogrenmek cok guzel";
		
		String arr[]=str.split(" ");
		String tersArr[]= new String[arr.length]; 
		for (int i = 0; i <=arr.length-1; i++) {
			tersArr[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(tersArr));
	
	
	
	for (int i = arr.length-1; i >= 0; i--) {
		System.out.print(arr[i]+" ");
	}
	
	
	
	
	
	
	}

}
