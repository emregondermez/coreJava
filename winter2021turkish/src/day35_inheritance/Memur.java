package day35_inheritance;

public class Memur extends Personel {

	public int maas;

	public Memur() {
		//super();
	System.out.println("Child class parametresiz constructor calisti");
	}

	public Memur(int maas) {
		super();
		System.out.println("Child class parametreli constructor calisti");
	}

	/*
	  Inheritance'da constructor olusturdugumuzda java'nin otomatik olarak constructor'a koydugu 
	  super(); keyword'u onemlidir.
	  super() keyword default constructor gibidir. 
	  baska bir keyword yazdigimzida etkisiz hale gelir. 
	 */
	
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Memur obj1 = new Memur(2400);
		 
  
	}

	
}
