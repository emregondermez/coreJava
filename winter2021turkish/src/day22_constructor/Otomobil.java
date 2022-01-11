package day22_constructor;

public class Otomobil {
	public Otomobil(String renk){ // istersek constructor u parametreli olarak olustrurabiliriz
		}						// biz constructor olusturdugumuzda java default olani yok eder
								// dolayisiyla biz constructor olusturdugumuzda mutlaka default un yerine
								// bir constructor yazmaliyiz
		
	public Otomobil() {}// default un yerine bir constructor yazmaliyiz
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}
