package day05Wapper;

public class Concatenaion {

	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "guzel";
		int sayi1 = 5;
		int sayi2 = 4;
		
		
		/*java guzel 54
		 * java 5 guzel
		 * java 94
		 * java 19
		 * 54 guzel
		 */
		
		System.out.println(str1+" "+ str2 +" "+ sayi1+ sayi2);
		System.out.println(str1+" "+ sayi1+" "+ str2);
		System.out.println(str1+" "+(sayi1+sayi2)+ sayi2);
		System.out.println(str1+" "+(sayi1-sayi2)+(sayi1+sayi2));
		System.out.println(""+sayi1+sayi2+" "+str2);
		
		
		
	}

}
