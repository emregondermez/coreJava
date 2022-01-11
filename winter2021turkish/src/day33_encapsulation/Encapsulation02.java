package day33_encapsulation;

public class Encapsulation02 {
	private String okulAdi ="Yildiz koleji"; // okul isminin baska Class lardan okunmasini ancak
	// degistirilmemesini istiyorsak getter() metodu kullaniriz
	
	private String tcNo ="12345678901";
	private int hesapNo=5554321;
	// obje olusturularak deger atayip kullanilmasini istedigimiz variable'in gorunmememsini
	// istiyorsak setter() metodu kullaniriz
	
	
	public static void main(String[] args) {
		// Eger kullanmak istedigimiz class uyeleri public degilse baska
		// package'lerden ulasmak icin extra islem yapmamiz gerekir.
		
		// yapacagimiz islemlerden 1.si encapsulation (data saklama) 
		// bu class'da kimseyle paylasmak istemedigimiz variable ve metodlar olusturalim
	
		// private yapinca guvenlik konusunu halletmis olduk
		// Ancak class uyeleri'nin private olmasi OOP concept'e aykiridir.
		                                    
		// Encapsilation Class uyelerine kimlerin ne oranda ulasabilecegini belirlemek icin yapilir
		
		                    	
	
	
	}
	@SuppressWarnings("unused")
	private void denemeMethod() {
	 System.out.println("Deneme methodu calisti");      
	}
	public String getOkulAdi() {
		return okulAdi;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		System.out.println(hesapNo);
	}
}
