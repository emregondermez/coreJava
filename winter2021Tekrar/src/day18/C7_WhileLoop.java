package day18;

import java.util.Scanner;

public class C7_WhileLoop {

	public static void main(String[] args) {
//		Kullanicidan bir sayi alin ve 
//		bu sayiyi tam bolen sayilari ve toplam kac tane
//		olduklarini ekranda yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi = scan.nextInt();

		int baslangic = 1;
		int count = 0;

		if (sayi<0 ) {
			System.out.println("Lutfen pozitif bir sayi giriniz");
		} else {
			while (baslangic <= sayi) {
				if (sayi % baslangic == 0) {
					System.out.print(baslangic + "-");
					count++;
				}
				baslangic++;
			}
			System.out.print("olmak uzere");
			System.out.println(sayi + " sayisinin " + count + " adet tam boleni vardir");
		}
		scan.close();
	}

}
