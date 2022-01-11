package day33_StringBuilder;

public class C04_Insert {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("Java ogrendik");
		// araya "yi cok iyi"ekleyelim 
		sb.insert(4, "yi cok iyi");
		
		System.out.println(sb);
		
		sb.insert(7, "cok iyiyim", 0, 4);
		
		System.out.println(sb);
		
	}

}
