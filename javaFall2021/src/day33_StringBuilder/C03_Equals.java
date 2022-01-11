package day33_StringBuilder;

public class C03_Equals {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.compareTo(sb2)); // 0
		// eger iki stringBuilder'i karsilastimak istersek bunu compare metodu ile yapabiliriz
		// eger sonuc 0 ise bu stringBuilderlar esittir
		// esik oladiklari zaman java alfabetik olarak sira farkini doner 
		
		StringBuilder sb3 = new StringBuilder("abc");
		StringBuilder sb4 = new StringBuilder("az");
	
		System.out.println(sb3.compareTo(sb4)); //-24
		String str = "Java";
		
		// System.out.println(sb1==str);  == sb ile String'i karsilastiramaz
		 System.out.println(sb1.equals(str)); // false
		// System.out.println(sb1.compareTo(str)); compare String icin kullanilamaz
		 
		
		//  System.out.println(sb1=="Java");
		 System.out.println(sb1.equals("Java")); // false
		// System.out.println(sb1.compareTo("Java"));
	}

}
