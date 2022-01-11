package day36_Inheritance;

import day35_Encapsulation_Inheritance.Muhasebe;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
		
		Memur mmr1 = new Memur();
		mmr1.isim="Hasan";
		mmr1.saatUcreti=16;
		System.out.println(mmr1.maasHesapla());
		
		
		
	}
	
}
