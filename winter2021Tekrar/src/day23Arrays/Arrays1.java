package day23Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// kullanicidan degerler alarak int bir deger olusturun
		//once kullanicidan girecegi sayiadedini almamiz lazim ki array'i olusturabilelim
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Array olusturmak icin once Array'in uzunlugunu giriniz");
		int uzunluk= scan.nextInt();
		int arr[]= new int[uzunluk];
		
		System.out.println("Lutfen sayilari giriniz");
		for (int i = 0; i < uzunluk; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		

		
scan.close();
	}

}
