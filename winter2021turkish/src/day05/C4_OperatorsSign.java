package day05;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		// = atama/ assignment 
		
		int sayi1= 5;
		int sayi2= 4;
		
		boolean isGreat=  sayi1 > sayi2 ; // true/false
		System.out.println(isGreat); //true
		
		boolean isSmall = sayi1<= sayi2;
		System.out.println(isSmall);
		
		
		boolean isEqual = sayi1 == sayi2;// == esit mi? anlamina gelir ve adi Comparison Operator'dur.
		System.out.println(isEqual);
		
		// " != " esit degildir isaretidir.
		
		System.out.println(sayi1+sayi2 !=9 ); //sayilarin toplami 9 degil. //false
		// tum mantiksal ifadelerde ! kullanildiginda olumsuzluk anlami katar.
		
		
	}

}
