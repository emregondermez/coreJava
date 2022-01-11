package day18;

import java.util.Scanner;

public class C4_WhileLoop4 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve
		// toplam kac tane olduklarini ekranda yazdirin

		System.out.println("bir sayi giriniz");
		Scanner scan = new Scanner(System.in);
		int sayi = scan.nextInt();
		int count = 0;

		int baslangic = 1;
		while (baslangic <= sayi) {

			if (sayi % baslangic == 0) {
				count++;
				System.out.println( count +" -->  "+baslangic + " ");
			}
			baslangic++;

		}
		System.out.println(sayi + " sayisinin boleneleri : " + count + " adettir");

		
		scan.close();
		
	}

}
