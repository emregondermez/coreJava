package day11_StringManipulations;

public class C03_Lenght {

	public static void main(String[] args) {
		
		String str1 ="Ali Kayhaoglu";
		System.out.println(str1.length()); //13
		
		// verilen str1'in son harfini yazdirin
		
		System.out.println(str1.charAt(str1.length()-1));

		String str2="";
		System.out.println(str2.length()); // 0
		
		String str3=null;  // null degereri bu variable yi olusturdugumuzu ama bilerek atama yapmadigimizi belirtir
		// System.out.println(str3.length()); // Exception in thread "main" java.lang.NullPointerException
		
		System.out.println(str3); //null
		
		// bir String'i yazdirdigimizda null cikiyorsa su analama gelir
		// string olusturuldu ancak henuz atama yapilmadi
		
		
	}

}
