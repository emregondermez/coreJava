package day23_statickeywords;

public class StringBlock {

	static String isim;
	// static block calistirildiginda ilk olarak calisir(main method'dan bile once calisir)
	// static block lar static variable'lara deger atamak icin kullanilir.
	static {
		isim="Mehmet";
		System.out.println(isim);
	}
	static {
		System.out.println("ikinci static block calisti");
	}
	
	public static void main(String[] args) {
		
		isim="Alican";
		System.out.println(isim);
		   

	}

}
