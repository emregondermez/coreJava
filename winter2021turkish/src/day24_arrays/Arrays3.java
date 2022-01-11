package day24_arrays;

public class Arrays3 {

	public static void main(String[] args) {
		// Verilen Array'in tum elemanlaarini toplayan bir program yaziniz

		int arr[] = { 10, 20, 30, 40, 50, 10};

		int toplam = 0;
		for (int i = 0; i <arr.length; i++ ) {

			toplam += arr[i];

		}
		System.out.println(toplam);
		
		// verilen Array'in elemanlarini toString metodu olmadan yazdirin ve aralarinda bir bosluk birakin
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
