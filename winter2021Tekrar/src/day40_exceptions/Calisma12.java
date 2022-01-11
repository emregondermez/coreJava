package day40_exceptions;

import java.util.ArrayList;
import java.util.List;

public class Calisma12 {

	public static void main(String[] args) {
		 List<Integer> rakamlar = new ArrayList<>();
	        rakamlar.add(5);
	        rakamlar.add(5);
	        rakamlar.add(7);
	        rakamlar.add(7);
	        rakamlar.add(9);
	        rakamlar.add(-1);
	        rakamlar.add(2);
	        rakamlar.add(4);
	        rakamlar.add(-1000);
	        rakamlar.add(4);
	        rakamlar.add(11);
	        
	        tekKareyazdir(rakamlar);


	}
	public static void tekKareyazdir(List<Integer> liste) {
		liste.stream().distinct().filter(x->x%2!=0).map(x->x*x).forEach(Calisma12::yazdir);
	}
	public static void yazdir(int x) {
		System.out.print(x+" ");
	}

}
