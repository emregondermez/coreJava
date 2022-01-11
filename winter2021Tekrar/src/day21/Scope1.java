package day21;

public class Scope1 {

	static int okulId = 1201;
	static String okulAdi = "Yildiz Koleji";
	static boolean acikMi;

	public static void main(String[] args) {

		System.out.println(okulAdi + " " + okulId + " " + acikMi);
		okulId=1202;
		
	}

	public static void staticMetod() {

	}

	public void method() { // bu metod static olmadigi icin calismaz 

	}
}





