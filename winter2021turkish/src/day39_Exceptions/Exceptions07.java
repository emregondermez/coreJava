package day39_Exceptions;

public class Exceptions07 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Data turlerini casting yaparken uygun olmayan islem yaparsak
		// Java ClassCastException verir
		
		
		int sayi = 10;
		// String str = sayi; // CTE

		String str = "123456";
		System.out.println(str + 10); // 12345610

		int strSayi = Integer.parseInt(str);
		System.out.println(strSayi + 10); // 123466

		String str2 = "123a34";

	//	System.out.println(Integer.parseInt(str2));  // ==> NumberFormatException

		
		Object sayi2 =40;
	//	String sayiStr = (String)sayi2;  //ClassCastException
	}

}
