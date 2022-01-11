package day38;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;

		while (count < 100) {
			System.out.println("Lutfen bolunecek sayiyi yaziniz");
			int sayi = scan.nextInt();
			System.out.println("kaca bolmek istediginizi yaziniz");
			int sayi2 = scan.nextInt();

			// Java'ya exceptions'u handle etmek icin bir cozum uretmezsek 
			// java exceptions ile garsilastiginda caslismayi durdurur calismayi durdurur (stop execution)
			// ve java bir exception firlatir(Throws exception)
			
			// tu application durmus olur
			// bu durum kabul edilemez
			// bu yuzden kodlari yazan kisi bunu ongormeli ve muhtemel sounlarin handle edilmesi icin 
			// java'ya yol gostermmelidir
			try {
				System.out.println("bolme islemeinin sonucu = " + (sayi / sayi2));
			} catch (ArithmeticException e) {
				System.out.println("sayiyi sifira bolemezsin");
			}
			count++;
		}
		scan.close();

	}

}
