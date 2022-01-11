package day37_Inheritance;

public class Corolla extends Toyota{

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimyeri="Turkiye";
	
	public static void main(String[] args) {
	
		// Java da obje olusturdugumuz her class ayni zamanda bir data turudur
		//Bu ornegimiz icin Corolla hem class adi hem de arb1 icin data type'dir
		
		Corolla          arb1  	=         new         	Corolla();
	//Class ismi & 		obje	assign	  keyword		constructor
	//	data turu 		ismi

		System.out.println(arb1.tekerSayisi);
		System.out.println(arb1.uretimyeri);
		
		Toyota arb2 = new Corolla();
		System.out.println(arb2.tekerSayisi);
		
		
		Araba arb3 = new Corolla();
		System.out.println(arb3.calisyorMu);
		
		
	}

}
