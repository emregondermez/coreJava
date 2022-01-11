package day21_Scope;

public class Scope1 {

	static int okulId = 1201;
	static String okulAdi = "Yildiz Koleji";
	static boolean acikMi;

		//static variable'lar class level de olusturuldugu icin class in her yerinden kullanilabilir 
		// instanca veriable lar static olmayan variable static olmayan method'lar da 
	
	public static void main(String[] args) {

		System.out.println(okulId + " " + okulAdi + " " + acikMi);//1202 Yildiz Koleji true
		okulId = 1202;
		acikMi = true;

		
	staticMethod();
	
	
	}

	public static void staticMethod() {
	 System.out.println(okulId + " " + okulAdi + " " + acikMi); //1202 Yildiz Koleji true
	}

	public void method() {

	}

}
