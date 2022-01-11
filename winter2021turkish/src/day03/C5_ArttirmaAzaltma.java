package day03;

public class C5_ArttirmaAzaltma {

	public static void main(String[] args) {
		
		
		int num = 15;
		
		// bir sayiyi iki arttirmak istersek dogal olarak 2 ile toplariz
		
		int num2 = num + 2;
		
		System.out.println("num2 = " + num2);
		
		num = num + 5;
		System.out.println(num);
		// bir sayiyi arttirmak (increment) istersek o sayiya istedigimiz sayiyi ekler ve sonucu varianle'a atariz
		 
		num = num+8;
		System.out.println(num);
		
		num +=10; // num'i 5 arttirin (pratik Java yolu)
		
		System.out.println("Javanin pratik yolu ile = " + num);
		
		
	    num++; // sadece 1 arttirmaya ozel Java pratik yol
		System.out.println("num'in son hali = "+ num);
				

	}

}
