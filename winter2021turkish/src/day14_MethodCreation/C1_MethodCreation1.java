package day14_MethodCreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
	
		String str ="Java cok guzel";
		
		// java methodlarin sadece ismine degil, isim + parametre lere bakar.
		// sadece  paremetlere sayisi degil parametrelerin data tiplerine de bakar

		str.endsWith("el"); //bu methodun gorevi gidip kelimenin son kismini kontrol etmek
							//bu methodu kullanmka icin bu method'un kontrol ettikten sonra 
							// bana rapor olarak ne getirdigini bilmem lazim (true/false)
	
	// 2)bir method olusturdugumzuda methodun ne yapacagina 
	//   ve gorevi yaptiktan sonra bana ne dondurecegine bastan karar vermeliyiz
	
	//3) bir medhod olustutuken "str.indexOf(str, fromIndex)" de oldugu gibi disaridan kaul edecegi parametreleri
	//   ve parametrelerin data tiplerini deklare etmeliyiz
		
	// methodu calistirmak istedigimizde (Method u cagirmak) parametre olarak olarak declare edilen bu data tiplerine uyygun  
	//	degerler girmeliyiz.
	//	girilen bu degerlere ARGUMENT denir
		
		str.indexOf("va", 1);
	
	
	}

}
