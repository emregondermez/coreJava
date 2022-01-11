package day32_Varrargs_StringBuilder;

public class C01_Varrargs {

	public static void main(String[] args) {
		
		topla(2,3,4,5,6);
		
		

	}

	private static void topla(int... sayilar) {
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println(toplam);
	}

}
