package day26_ForEachLoop_Constructor;

public class C02_ForEachLoop {

	public static void main(String[] args) {
		// Bir integer Array olusturunuz 
		// ve bu arraylerdeki elemanlarin carpimini each loop ile bulunuz
		// sonucu ekrana yazdiriniz
		
		int arr1[]= {2,4,5,6};
		
		int carpim=1;
		for (int i : arr1) {
			carpim*=i;
		}
		
		System.out.println(carpim);
		
		
		
	}

}
