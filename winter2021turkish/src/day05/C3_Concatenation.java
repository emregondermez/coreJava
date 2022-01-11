package day05;

public class C3_Concatenation {

	public static void main(String[] args) {
		
		//Concatenation(Birlestirme): Java'da birden fazla String'i + isareti ile toplarsaniz
		//Java bu Stringleri yanyana yazar
		
		String str1 = "java";
		String str2 = "guzeldir";
		System.out.println(str1+" "+str2);

		int sayi1 =5;
		int sayi2 =4;
		// verilen degiskenleri kullanarak konsolda 9 yazdirin
		System.out.println(sayi1+sayi2);
		
		System.out.println(str1+str2+(sayi1-sayi2));
		
		// 9 java guzeldir yazdirin
		System.out.println(sayi1+sayi2+' '+str1+str2); //41javaguzeldir
													   //java matematiksel bir islem yaparken char turunde bir degerle
														// karsilasirsa char'in ascii degeri ile islem yapar
		
		
		System.out.println(str1+str2+' '+sayi1*sayi2);//javaguzeldir 20

		/*Kural 1) eger toplanan degerlerden bir tanesi bile String ise Java toplama degil
		  concatenation yapar. 
		  Kural2) eger toplanan degerlerin ikisi de matematiksel islemse java toplar
		  Kural3) eger sayi ve String degiskenler kullanilirsa oncelikler belirlenip o islemler icin
		  parantez kullanilabilir
		 */

	    
	}

}
