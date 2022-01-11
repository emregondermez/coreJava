package day12_StringManipulation2;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		
		String str1 = "Ali Can";
		String str2 = str1+ ""; //  Ali Can
		
		System.out.println(str1==str2);// false
		//str1 ve str2'yi == ile karsilastirirsak degerleri ayni fakat adresleri farkli oldugu icin false doner
		
		
		System.out.println(str1.equals(str2));// true
		//equals() methodu sasdece Strinflerin degerlerini karsilastirir
		//bu ornekte str1 ve str2 nin derlerini ayni oldugu icin true dondurur
		
		
	}

}
