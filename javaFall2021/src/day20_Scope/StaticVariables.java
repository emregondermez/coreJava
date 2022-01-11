package day20_Scope;

public class StaticVariables {

	static int no=20;
	static int sayi;
	static String adres="Ankara";
	static boolean aktifMi=true;
	
	public static void main(String[] args) {
		//static varible'lara metod'dan direkk ulasilabilir
		
		System.out.println(no); //20
		
		no++;
		System.out.println(no);// 21
	}
	public static void staticMethod() {
		
	}

}
