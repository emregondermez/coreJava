package day22_ClassroomOdev;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 3 tane pozitif tam sayi alalim bu uc sayidan ucgen olup olmama
		 * durumunu kontrol edelim eger ucgen olabiliyor ise, es kenar ucgen mi kontrol
		 * edelim.
		 * 
		 * Ucgen olma kosullari. b+c>a>b-c 1 a+c>b>a-c 1 a+b>c>a-b 1
		 * 
		 * Eskenar ucgen olma kosullari. a=b=c
		 * 
		 * Konsolda asagidaki durumlari yazdiralim. Eskenar ucgen Sadece ucgen Ucgen
		 * degildir
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("ucgen olup olup olamayacagini kontrol etmek icin 3 uzunluk giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if ((b + c > a && a > b - c) || (a + b > c && c > a - b) || (a + c > b && b > a - c)) {
			System.out.println("ucgen olusturabilir");
			if (a == b && a == c) {
				System.out.println("eskenar ucgen");
			}

		} else {
			System.out.println("ucgen olusturmaz");
		}

		scan.close();
	}

}
