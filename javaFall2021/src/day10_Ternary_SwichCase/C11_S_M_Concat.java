package day10_Ternary_SwichCase;

public class C11_S_M_Concat {

	public static void main(String[] args) {
		// Strin olarak verilen bir degisken + ile 
		// baska bir degisken ile isleme sokulursa 
		// buna concatenation denir
		
		String isim = "Ali";
		String soyIsim = "Can";

		System.out.println(isim+" "+soyIsim);
		
		// ayni islemi + yerine concat() metodu ile de yapabiliriz
		
		System.out.println(isim.concat(" ").concat(soyIsim));
	
	}

}
