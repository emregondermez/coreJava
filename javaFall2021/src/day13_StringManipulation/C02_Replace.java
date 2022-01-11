package day13_StringManipulation;



public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 sayisinin 100 den
		// buyuk olmadigini yazdirin

		String num = "10.000";

		num = num.replace(".", "");

	if (Integer.valueOf(num)<=100) {
		System.out.println("sayi 100'den buyuk degil");
	} else {
		System.out.println("sayi 100'den buyuk");
	}
		
	
	
	

	
	}

}
