package day04;

public class C1_ModulusOperatoru {

	public static void main(String[] args) {
		
		
		// modulus operatoru bolme isleminde kalani verir 
		
		// 15 tek mi cift mi ? 15/2 =3
		//sayinin 7 ile bolunebilirligini kontrol etmek icin modulus islemi kullanilir
		
		int kalan= 15 % 4;
		System.out.println(kalan); //3
		
		System.out.println(26 % 8); //2
		
		//856 sayisinin birler basamagi kactir? 
		int sayi = 856;
		int birlerBasamagi = sayi % 10;
		System.out.println("sayinin birler basamagi = " + birlerBasamagi);
	
		//856'nin onlar basamagi kactir?
		//Bunun icin buldugum birler basamagindan kurtulmak gerekir
		//birlerbasamagindan kurtulmak icin sayiyi 10 a boluyoruz
		
		sayi/=10;//85
		System.out.println("10' a boldukten sonra sayinin degeri : " + sayi);
		int onlarBas = sayi %10;
		System.out.println("sayinin onlar basamagi = " + onlarBas);
		
	}

}
