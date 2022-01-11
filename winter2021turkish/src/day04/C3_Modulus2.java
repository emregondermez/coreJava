package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		// Kullanicidan 4 basamakli bir sayi alalim ve sayiyinin basamaklarini ters sirada yazdiralim
		
		// bir sayinin basamaklarini elde etmek icin 2 islemi tekrar tekrar yapariz
		//1.islem en sondaki en sondakin basamagi elde etmek
		//2.islem en son basmagi yok etmek
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 4 basamakli bir sayi giriniz");
		int sayi = scan.nextInt(); 
		// 4 basamagi elde etmek icin yukarida yazdigimiz islemi 3 kere yapiyoruz
		//1.tekrar
		int birlerBas= sayi % 10;
		sayi/=10;
		// bu satirdan itibaren sayimiz 3 basamakli oldu
		// onlar basamagini bulmak icin 2.tekrar
		
		int onlarBas = sayi % 10 ;
		sayi/=10;
		
		// bu satirdan itibaren sayimiz 2 basamakli
		// yuzler basamagini bulmak icin 3.tekrar
		int yuzlerBas= sayi % 10;
		sayi/=10;
		
		//bu satirdan itibaren sayimiz 1 basamakli
		int binlerBas = sayi % 10; // burada % islemi yapmak zorunda degiliz
		
		
		
		//tum basamaklar var
		// tum basamaklari yaziralim
	
		System.out.println("birler bas = " + birlerBas);
		System.out.println("onlar bas = " + onlarBas);
		System.out.println("yuzler bas = " + yuzlerBas);
		System.out.println("binler bas = " + binlerBas);
		
		System.out.print( birlerBas);
		System.out.print( onlarBas);
		System.out.print(yuzlerBas);
		System.out.println( binlerBas);

		
		 //rakamlar toplamini degil sayilari yan yana yazmak istersek
		System.out.println("Yazdiginiz sayinin tersten yazilisi = " +birlerBas+onlarBas+yuzlerBas+binlerBas);
		
		scan.close();
		
	}

}
