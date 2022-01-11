package day14;

public class C5_ReplaceAll {
	public static void main(String[] args) {
		
		//replaceAll un replaca den 2 farki vardir:
		//1--> replace char kabul eder ama replaceAll char kanul etmez
		//2--> replaceAll regex (Regular Expressions) kullanir.
		
	/*
	 \\w ---> harfler ve rakamlar yerine yazdirir
	 \\W ---> harfler ve rakamlar disindakiler  yerine yazdirir
	 \\s ---> bosluk yerine yazdiri
	 \\S ---> bosluk disindakiler yerine yazdirir
	 \\d ---> rakamlar yerine yazdirir
	 \\D ---> rakamlar disindakiler yerine yazdirir
	 */
		
		String str = "Java ogren, mutlu ol, Java candir 123";
		System.out.println(str.replaceAll("\\d", "*")); // rakamalar yerine * yazdiracak
		System.out.println(str.replaceAll("\\W", "*")); // harfler ve rakamlar disindakiler yerie * yazdiracak
		System.out.println(str.replaceAll("\\s", "*")); // bosluk yerine *
		System.out.println(str.replaceAll("\\D", "*")); // rakamlar disindakiler yerine * yazdirir
		System.out.println(str.replaceAll("\\S", "*")); // bosluk disindakiler yerine * yazdirir
		System.out.println(str.replaceAll("\\w", "*")); // kelime ve harfler yerine * 
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
