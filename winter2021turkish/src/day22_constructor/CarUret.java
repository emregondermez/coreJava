package day22_constructor;

public class CarUret {
	// Constructor bu class ta nerede?
	// su anda bu class ta gorunur bir constructor yok
	// bir class olusturuldugunda Java bu class ta obje uretilecegini bilir
	// ve gorunmeyen Default Constructor'i class a yerlestirir
	// default constructor parametresizdir dolayisiyla sadece hic bir ozelligi
	// olmayan tanimlanamayan
	// objeler uretir
	// default constructor ile uretilen bir objenin tum ozellikleri sonra
	// tanimlanabilir

	// eger biz sonradan bir constructor yazarsak Java default constructor'u iptal
	// eder

	// bir constructor olusturalim

	public CarUret() {

	}
	// kurallar:
//1->ismi class ile ayni olmalidir
//2->return type sahip degildir
//3->constructor isminden sonra mutlaka parantez olur--> parantez icerinde parametre olmasi opsiyoneldir
//4->bir constructor olusturuldugunda kimlerin kullanabilecegini belirlemek icin access modifier kullaniriz

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	// bir programda cok fazla uretecegimiz objeler icin bir tane class olustururuz
	// bu class'da olusturulacak objelere ait tum ozellikler olur
	// bu class direk calistirilmayacagi icin main method olmasa da olur
	// (Kaliphane gibidir)

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");
	}

	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
	}

}
