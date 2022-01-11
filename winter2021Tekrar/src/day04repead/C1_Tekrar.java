package day04repead;

import java.util.Scanner;

public class C1_Tekrar {
		public static void main(String[] args) {
			
			// Kullanicidan 4 basamakli bir sayi alalim ve sayiyinin basamaklarini ters sirada yazdiralim
			
			// bir sayinin basamaklarini elde etmek icin 2 islemi tekrar tekrar yapariz
			//1.islem en sondaki en sondakin basamagi elde etmek
			//2.islem en son basmagi yok etmek
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen 4 basamakli bir sayi giriniz");
			int sayi = scan.nextInt();
			System.out.println("girdiginiz sayi = " + sayi);

			int birlerBas= sayi %10 ;
			System.out.println("birler basamagi = " + birlerBas );
			
			sayi/=10; // sayi artik 3 basamakli
			
			int onlarBas = sayi %10;
			System.out.println("onlar basamagi = " + onlarBas);

			sayi/=10; // sayi artik 2 basamakli
			
			int yuzlerBas = sayi % 10 ;
			System.out.println("yuzler basamagi = " + yuzlerBas);
			
			sayi/=10; // sayi artik tek basamakli
			int binlerBas = sayi % 10;
			System.out.println("binler basamagi = " + binlerBas);
			
			System.out.print("sayinin tersten yazilisi = ");
			System.out.print(birlerBas);
			System.out.print(onlarBas);
			System.out.print(yuzlerBas);
			System.out.print(binlerBas);
			
			scan.close();
		}
}
