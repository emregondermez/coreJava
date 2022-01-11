package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Fibonacci {

	public static void main(String[] args) {
		// verilen sayidan  kucuk fibonacci sayilarini bir list olarak kaydedin
		
		List<Integer> fibo = new ArrayList<>();
		fibo.add(1);
		fibo.add(1);
		System.out.println(fibo);
		 int sinir =100;
		 int sayi=0;
		 
		
		
		while(sayi<sinir) {
			sayi=fibo.get(fibo.size()-1)+fibo.get(fibo.size()-2);
			fibo.add(sayi);
		}
		System.out.println(fibo);
		
		
//		for (int i = 0; i <=10; i++) {
//			
//			fibo.add((fibo.get(fibo.size()-1))+fibo.get(fibo.size()-2));
//		
//		}
//		System.out.println(fibo);
//		
//		
		
	}

}
