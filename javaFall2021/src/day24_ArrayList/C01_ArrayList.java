package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// list olusturalim
		
		
		ArrayList<String> isimList= new ArrayList<>();

		List <String> isimList1 = new ArrayList<>();
		// Bazen esitligin sag tarafindaki elmasin icersine data turu  yazilmazsa sorun cikabilir
		// ama genellikle cikmaz, Biz de List olustururken sag tarafa data turu yazmayiz
		
		
		// esitligin sag tarafinda ArrayList yerine list yazamayiz
		
		//  xx--> List<String> isim1= new List<>();
		
		List<Integer> sayi1 = new ArrayList<>();
		
		// List data turu olarak primitive data turlerini kabul etmez
		List<Boolean> bol = new ArrayList<>();
	}

}
