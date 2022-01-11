package day33_StringBuilder;

public class C02_Delete {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java Candir Can");
		
		sb.delete(sb.length()-3, sb.length());
		System.out.println(sb);

	}

}
