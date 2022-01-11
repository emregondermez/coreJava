package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		// kullanicidan bir sayi alin
		// aldiginiz sayidan kucuk olan fibinacci dizisi elamanlarini yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen pozitif bir tam sayi giriniz");
		int sayi = scan.nextInt();

		List<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		
		
		
		for (int i = 2; fibo.get(i-2)+fibo.get(i-1) < sayi; i++) {
		
			fibo.add(fibo.get(i-2)+fibo.get(i-1));
		}
		System.out.println(fibo);
	
		scan.close();
	}

}
