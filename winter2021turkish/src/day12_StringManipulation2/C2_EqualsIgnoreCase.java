package day12_StringManipulation2;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsIgnoreCase() method'u karsilastirdigi Stringler e case sensitive (buyuk/kucuk harf duyarliligi)
		//olmaksizin bakar.
		// Stringler ayni ise true ayni degilse false doner
		
		String str1 = "Ali Can";
		String str2 = "ali CAN";
		String str3 = "Ali can ";
		
		System.out.println(str1.equals(str2));//false
		
		System.out.println(str1.equalsIgnoreCase(str1)); //true
		
		System.out.println(str1.equals(str3));//false
		System.out.println(str1.equalsIgnoreCase(str3)); //false);
		
		
		
		
 	}

}
