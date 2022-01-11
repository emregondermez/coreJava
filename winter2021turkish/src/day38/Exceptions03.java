package day38;

public class Exceptions03 {

	public static void main(String[] args) {
		// try-catch in gorevi

		int sayi1 = 10;
		int sayi2 = 0;

		Exceptions01 exp = new Exceptions01();

		try {
			System.out.println("islemin sonucu = " + (sayi1 / sayi2));
		} catch (ArithmeticException e) {
			// ArithmeticException Java'da bir class e objesi icin data turu e ise
			// ArithmeticException
			// Class'indan olusturdugumuz objenin adi
			// ismi e olmaz zorunda degil ama genel kullanim e dir.
			System.out.println(e); // java.lang.ArithmeticException: / by zero
			// bu durumda hem Java'ya sorunu belirmesi icin firsat vermis
			// hem de application'u bloke etmemis oluruz
			System.out.println(e.getMessage()); // / by zero

			e.printStackTrace();
			/*
			 * java.lang.ArithmeticException: / by zero at
			 * day38.Exceptions03.main(Exceptions03.java:14)
			 */

		}
		System.out.println("kod bloke olmamisss");

	}

}
