package day14;

public class C6_Substring {

	public static void main(String[] args) {
		
		String str = "Her ders Java gibi olsa";
		
		//str in ilk on harfini * ile gizleyin geriye kalanlar normal yazilsin
		
		System.out.println(str.replace("a", "*"));
		System.out.println(str.replace(str.substring(0, 9), "*"));
		System.out.println(str.substring(10));
		System.out.println(str.substring(0, 10));
	
		
		
		System.out.println("========"+str.substring(0, 10).replaceAll("\\S", "*")+str.substring(10));
		
		String ilkOn= str.substring(0, 10);
		String sonOn = str.substring(10, str.length());
		System.out.println(ilkOn);
		System.out.println(sonOn);
	
	System.out.println(str.substring(0, 10).replaceAll("\\S", "*")+str.substring(10));
	
	}
 
}
