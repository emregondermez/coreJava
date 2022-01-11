package day32_Varrargs_StringBuilder;

public class C02_Varrangs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	kafanaGoreTopla(2,3,6,4,2);
	
	}

	private static void kafanaGoreTopla(int sayi1,int... sayilar) {
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("ilk eleman ile geriye kalnalrin toplaminin carpimi : "+sayi1*toplam);
	}
}
